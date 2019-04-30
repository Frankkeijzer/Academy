package oefeningen.week3.voertuigen;

import java.util.ArrayList;

abstract public class Voertuigen {
	String merk;
	int aantalWielen;
	
	ArrayList<Voertuigen> Voertuigen = new ArrayList<>();
	
	abstract void maakGeluid();
	abstract void toonJezelf();
	
}
