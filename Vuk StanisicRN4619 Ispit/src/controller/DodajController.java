package controller;

import java.util.ArrayList;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import model.Ploca;
import model.PloceDole;
import model.Server;
import view.MainView;

public class DodajController implements EventHandler<ActionEvent> {
private MainView mv;


	public DodajController(MainView mv) {
	super();
	this.mv = mv;
}


	public void handle(ActionEvent event) {
		int brKomada=0;
		Integer cena=0;
		
	//	for(Ploca p:mv.getLvGore().getSelectionModel().getSelectedItems()) {
		//	Ploca p1=new Ploca(mv.getLvGore().getSelectionModel().getSelectedItem().getIzvodjac(), mv.getLvGore().getSelectionModel().getSelectedItem().getNaslov(), mv.getLvGore().getSelectionModel().getSelectedItem().getGodina(), mv.getLvGore().getSelectionModel().getSelectedItem().getVrsta(), mv.getLvGore().getSelectionModel().getSelectedItem().getZanr(), mv.getLvGore().getSelectionModel().getSelectedItem().getCena(), mv.getLvGore().getSelectionModel().getSelectedItem().getTip());
		//	ploce.add(p1);
		//	cena+=p1.getCena();
		//}
		ObservableList<Ploca> lista=mv.getLvGore().getSelectionModel().getSelectedItems();
		
		mv.getTvDole().getItems().clear();
		mv.getTvDole().getItems().addAll(lista);
		for(Ploca p:lista) {
			cena+=p.getCena()*mv.getCbKolicina().getSelectionModel().getSelectedItem();
			
		}
		
		cena+=Integer.parseInt(mv.getlUkupno().getText());
		
		mv.getlUkupno().setText(cena.toString());
		
		brKomada=mv.getCbKolicina().getSelectionModel().getSelectedItem();
		
		
		//Ploca p=mv.getLvGore().getSelectionModel().getSelectedItem();
		//mv.getTvDole().getItems().add(p);
		
	}

}
