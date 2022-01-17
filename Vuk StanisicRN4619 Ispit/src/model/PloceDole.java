package model;

public class PloceDole {
private String ploca;
private int komada;
private int cena;

public PloceDole(String ploca, int komada, int cena) {
	super();
	this.ploca = ploca;
	this.komada = komada;
	this.cena = cena;
}

public String getPloca() {
	return ploca;
}

public void setPloca(String ploca) {
	this.ploca = ploca;
}

public int getKomada() {
	return komada;
}

public void setKomada(int komada) {
	this.komada = komada;
}

public int getCena() {
	return cena;
}

public void setCena(int cena) {
	this.cena = cena;
}




}
