package oefeningen.OCA.packageKlasse.packageKlasse2;

public class KlasseVoorFunctInt {
	public static void main(String[] args) {
	Schreeuwen schreeuw = new Schreeuwen();
	MyFunctInterf myfunctfinterf = x -> Schreeuwen.decibel + x;
	System.out.println(myfunctfinterf.test(5));
	
//	MyFunctInterf var1 = x -> x.optellen + x;
	//Schreeuwen.decibel + x;

	
	}
}

class Schreeuwen{
	static int decibel = 50;
	int optellen() {
		return 10;
	}
}