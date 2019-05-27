package oefeningen.OCA.packageKlasse.packageKlasse2;

public class KlasseSub3 {
	void methodeKlasse() {
		System.out.println("Klasse: "+2*3);
	}
	
	
	public static void main(String[] args) {
//		KlasseSub3 var1 = new KlasseSub3();
//		var1.methodeKlasse();
		KlasseSub3 varsub = new KlasseSub3Sub1();
		varsub.methodeKlasse();
	}
}
