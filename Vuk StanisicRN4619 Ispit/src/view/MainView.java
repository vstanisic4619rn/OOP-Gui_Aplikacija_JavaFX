package view;



import java.util.ArrayList;

import controller.DodajController;
import controller.PrikaziController;
import controller.StampajController;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import model.Ploca;
import model.PloceDole;
import model.Server;
import model.Tip;
import model.Zanr;

public class MainView extends Stage{
private TableView<Ploca> tvPloca=new TableView<Ploca>();
private RadioButton rbNove=new RadioButton();
private RadioButton rbPolovne = new RadioButton();
private RadioButton rbSve=new RadioButton();
private Button bPrikazi=new Button("Prikazi");
private ListView<Ploca> lvGore=new ListView<Ploca>();
private TableView<Ploca> tvDole=new TableView<Ploca>();
private ComboBox<Integer>cbKolicina=new ComboBox<Integer>();
private Button bStampaj=new Button("Stampaj racun");
private Button bDodaj=new Button("Dodaj u korpu");
private Label lUkupno=new Label("0");

public MainView() {
	ToggleGroup tgGroup=new ToggleGroup();
	rbNove.setToggleGroup(tgGroup);
	rbPolovne.setToggleGroup(tgGroup);
	rbSve.setToggleGroup(tgGroup);
	HBox hb1=new HBox();
	hb1.getChildren().addAll(rbNove,new Label(" nove  "),rbPolovne,new Label("  polovne  "),rbSve,new Label("  sve  "));
	hb1.setAlignment(Pos.CENTER);
	
	VBox vb=new VBox(7);
	
	vb.getChildren().addAll(hb1,bPrikazi);
	vb.setAlignment(Pos.CENTER);
	
	HBox hb2=new HBox(6);
	hb2.getChildren().addAll(new Label("Kolicina:"),cbKolicina,bDodaj);
	
	VBox vb1=new VBox();
	vb1.getChildren().addAll(lvGore,hb2);
	vb1.setAlignment(Pos.CENTER_RIGHT);
	
	
	HBox hb=new HBox(15);
	hb.getChildren().addAll(tvPloca,vb,vb1);
	hb.setAlignment(Pos.CENTER);
	
	
	HBox hb3=new HBox(12);
	hb3.getChildren().addAll(new Label("Ukupno :"),lUkupno,bStampaj);
	hb3.setAlignment(Pos.CENTER);
	
	VBox vb4=new VBox(8);
	vb4.getChildren().addAll(hb,new Label("Sadrzaj korpe"),tvDole,hb3);
	vb4.setAlignment(Pos.CENTER);
	
	
	Scene s=new Scene(vb4,900,600);
	this.setScene(s);
	this.setTitle("OOP-Jun 2020 Ispit Java");
	
	ArrayList<Integer> lista=new ArrayList<Integer>();
	lista.add(1);
	lista.add(2);
	lista.add(3);
	lista.add(4);
	lista.add(5);
	cbKolicina.getItems().setAll(lista);
	cbKolicina.setValue(2);
	
	
	TableColumn<Ploca, String>tcZanr=new TableColumn<Ploca, String>("Zanr");
	TableColumn<Ploca, Integer>tcNove=new TableColumn<>("Nove");
	TableColumn<Ploca, Integer>tcPolovne=new TableColumn<>("Polovne");
	lvGore.setPrefSize(400, 180);
	
	lvGore.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
	
	tcZanr.setCellValueFactory(new PropertyValueFactory<>("zanr"));
	tcNove.setCellValueFactory(new PropertyValueFactory<>("nova"));
	tcPolovne.setCellValueFactory(new PropertyValueFactory<>("polovna"));
	tvPloca.getColumns().addAll(tcZanr,tcNove,tcPolovne);
	tvPloca.getItems().setAll(Server.ploce);
	tvPloca.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
	
	//lvGore.getItems().setAll(Server.ploce);
	
TableColumn<Ploca, String> tcNaziv=new TableColumn<Ploca, String>("Artikal");
TableColumn<Ploca, Integer> tcKomada=new TableColumn<Ploca, Integer>("Broj komada");
TableColumn<Ploca, Integer>tcCena=new TableColumn<Ploca, Integer>("Cena");
tvDole.getColumns().addAll(tcNaziv,tcKomada,tcCena);
tcNaziv.setCellValueFactory(new PropertyValueFactory<>("naslov"));
tcKomada.setCellValueFactory(new PropertyValueFactory<>("ukupnoKomada"));
tcCena.setCellValueFactory(new PropertyValueFactory<>("cena"));
tcNaziv.setPrefWidth(300);
tcKomada.setPrefWidth(250);
tcCena.setPrefWidth(300);

	
	
	bPrikazi.setOnAction(new PrikaziController(this));
	bDodaj.setOnAction(new DodajController(this));
	bStampaj.setOnAction(new StampajController(this));
	}

public TableView<Ploca> getTvPloca() {
	return tvPloca;
}

public void setTvPloca(TableView<Ploca> tvPloca) {
	this.tvPloca = tvPloca;
}

public RadioButton getRbNove() {
	return rbNove;
}

public void setRbNove(RadioButton rbNove) {
	this.rbNove = rbNove;
}

public RadioButton getRbPolovne() {
	return rbPolovne;
}

public void setRbPolovne(RadioButton rbPolovne) {
	this.rbPolovne = rbPolovne;
}

public RadioButton getRbSve() {
	return rbSve;
}

public void setRbSve(RadioButton rbSve) {
	this.rbSve = rbSve;
}

public Button getbPrikazi() {
	return bPrikazi;
}

public void setbPrikazi(Button bPrikazi) {
	this.bPrikazi = bPrikazi;
}

public ListView<Ploca> getLvGore() {
	return lvGore;
}

public void setLvGore(ListView<Ploca> lvGore) {
	this.lvGore = lvGore;
}

public TableView<Ploca> getTvDole() {
	return tvDole;
}

public void setTvDole(TableView<Ploca> tvDole) {
	this.tvDole = tvDole;
}

public ComboBox<Integer> getCbKolicina() {
	return cbKolicina;
}

public void setCbKolicina(ComboBox<Integer> cbKolicina) {
	this.cbKolicina = cbKolicina;
}

public Button getbStampaj() {
	return bStampaj;
}

public void setbStampaj(Button bStampaj) {
	this.bStampaj = bStampaj;
}

public Button getbDodaj() {
	return bDodaj;
}

public void setbDodaj(Button bDodaj) {
	this.bDodaj = bDodaj;
}

public Label getlUkupno() {
	return lUkupno;
}

public void setlUkupno(Label lUkupno) {
	this.lUkupno = lUkupno;
}



}
