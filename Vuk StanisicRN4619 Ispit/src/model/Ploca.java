package model;

import java.util.ArrayList;

import view.MainView;

public class Ploca {
private String izvodjac;
private String naslov;
private int godina;
private String vrsta;
private String zanr;
private int cena;
private String tip;
private int nova;
private int polovna;
private int ukupnoKomada;
private int ukupnoCena;
private ArrayList<Ploca> zanr2;

public Ploca(String izvodjac, String naslov, int godina, String vrsta, String zanr, int cena, String tip) {
	super();
	this.izvodjac = izvodjac;
	this.naslov = naslov;
	this.godina = godina;
	this.vrsta = vrsta;
	this.zanr = zanr;
	this.cena = cena;
	this.tip = tip;
	nova=Server.getNove();
	polovna=Server.getPolovne();
	ukupnoKomada=ukupnoKomada();
	zanr2=getZanrovi();
}

public static ArrayList<Ploca> getPolovne() {
	ArrayList<Ploca>polovne=new ArrayList<Ploca>();
	for(Ploca p:Server.ploce) {
		if(p.getTip().contains("polovna")) {
			polovne.add(p);
		}
	}
	return polovne;
}

public String getIzvodjac() {
	return izvodjac;
}

public void setIzvodjac(String izvodjac) {
	this.izvodjac = izvodjac;
}

public String getNaslov() {
	return naslov;
}

public void setNaslov(String naslov) {
	this.naslov = naslov;
}

public int getGodina() {
	return godina;
}

public void setGodina(int godina) {
	this.godina = godina;
}

public String getVrsta() {
	return vrsta;
}

public void setVrsta(String vrsta) {
	this.vrsta = vrsta;
}


public String getZanr() {
	return zanr;
}

public void setZanr(String zanr) {
	this.zanr = zanr;
}

public int getCena() {
	return cena;
}

public void setCena(int cena) {
	this.cena = cena;
}

public String getTip() {
	return tip;
}

public void setTip(String tip) {
	this.tip = tip;
}

@Override
public String toString() {
	return izvodjac + " " + naslov+ " "+godina+"("+ tip +")" + cena+".0din"+" "+vrsta; 
}

public int getNova() {
	return nova;
}

public void setNova(int nova) {
	this.nova = nova;
}

public int getPolovna() {
	return polovna;
}

public void setPolovna(int polovna) {
	this.polovna = polovna;
}

public static int ukupnoKomada() {
	int br=0;
	MainView mv=new MainView();
for(Ploca p:mv.getLvGore().getSelectionModel().getSelectedItems()) {
	br++;
}
return br;
}
public static ArrayList<Ploca> getZanrovi() {
ArrayList<Ploca> zanrovi=new ArrayList<Ploca>();
	for(Ploca p: Server.ploce) {
		if(!zanrovi.contains(p)) {
			zanrovi.add(p);
		}
	}
	return zanrovi;
}


}
