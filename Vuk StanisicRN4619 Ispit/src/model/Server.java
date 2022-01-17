package model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Server {

	public static ArrayList<Ploca> ploce=new ArrayList<Ploca>();
	
	public static void loadServer() {
		try {
			BufferedReader br=new BufferedReader(new FileReader("katalog.txt"));
			String linija=br.readLine();
			
		while(linija!=null) {
			String[] atributi=linija.split(",");
			ploce.add(new Ploca(atributi[0],atributi[1],Integer.parseInt(atributi[2]),atributi[3],atributi[4],Integer.parseInt(atributi[5]),atributi[6]));
		linija=br.readLine();
		}
		br.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static int getPolovne() {
		ArrayList<Ploca>polovne=new ArrayList<Ploca>();
		int broj=0;
		for(Ploca p:Server.ploce) {
			if(p.getTip().contains("polovna")) {
				broj++;
			}
		}
		return broj;
		
	}
	public static int getNove() {
		ArrayList<Ploca>nove=new ArrayList<Ploca>();
		int broj=0;
		for(Ploca p:Server.ploce) {
			if(p.getTip().contains("nova")) {
				broj++;
			}
		}
		return broj;
		
	}

}
