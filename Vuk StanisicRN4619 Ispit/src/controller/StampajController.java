package controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import model.Ploca;
import view.MainView;

public class StampajController implements EventHandler<ActionEvent>{
private MainView mv;

	public StampajController(MainView mv) {
	super();
	this.mv = mv;
}

	@Override
	public void handle(ActionEvent event) {
		try {
			PrintWriter pw=new PrintWriter(new File("racun.txt"));
			Ploca p=new Ploca(mv.getLvGore().getSelectionModel().getSelectedItem().getIzvodjac(), mv.getLvGore().getSelectionModel().getSelectedItem().getNaslov(), mv.getLvGore().getSelectionModel().getSelectedItem().getGodina(), mv.getLvGore().getSelectionModel().getSelectedItem().getVrsta(), mv.getLvGore().getSelectionModel().getSelectedItem().getZanr(),mv.getLvGore().getSelectionModel().getSelectedItem().getCena(), mv.getLvGore().getSelectionModel().getSelectedItem().getTip());
		pw.println(p);
		for(Ploca p1:mv.getTvDole().getSelectionModel().getSelectedItems()) {
			//pw.println(p1);
			pw.println(mv.getTvDole().getSelectionModel().getSelectedItem().getIzvodjac()+mv.getTvDole().getSelectionModel().getSelectedItem().getNaslov()+"("+mv.getTvDole().getSelectionModel().getSelectedItem().getGodina()+")"+mv.getTvDole().getSelectionModel().getSelectedItem().getTip()+"________________________________"+mv.getTvDole().getSelectionModel().getSelectedItem().getCena()+ "\n");
		
			pw.close();
		}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
