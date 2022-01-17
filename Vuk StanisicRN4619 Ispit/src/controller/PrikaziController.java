package controller;

import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import model.Ploca;
import model.Server;
import view.MainView;

public class PrikaziController implements EventHandler<ActionEvent>{
private MainView mv;


	public PrikaziController(MainView mv) {
	super();
	this.mv = mv;
}


	@Override
	public void handle(ActionEvent event) {
		ArrayList<Ploca> lista=new ArrayList<>();
		for(Ploca p:Server.ploce) {
			if(p.getZanr().contains(mv.getTvPloca().getSelectionModel().getSelectedItem().getZanr())) {
			if(mv.getRbNove().isSelected()) {
				if(p.getTip().contains("nova")) {
					lista.add(p);
				}
			}else if(mv.getRbPolovne().isSelected()) {
				if(p.getTip().contains("polovna")) {
					lista.add(p);
				}
			}else {
				lista.add(p);
			}
		}
		}
		mv.getLvGore().getItems().clear();
		mv.getLvGore().getItems().setAll(lista);
	}

}
