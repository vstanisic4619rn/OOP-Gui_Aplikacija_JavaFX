package model;

public class NovaPloca {
private int novaBroj;

public NovaPloca(int novaBroj) {
	super();
	novaBroj=Server.getNove();
}

public int getNovaBroj() {
	return novaBroj;
}

public void setNovaBroj(int novaBroj) {
	this.novaBroj = novaBroj;
}


}
