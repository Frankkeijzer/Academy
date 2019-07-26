package oefeningen.OCA2.Obj7.Klasse;

class Medewerker implements Bedrijf {
	String naam = "naam in Medewerker";
	void werken() {
		System.out.println("De medewerker werkt, zijn naam is " + naam);
	}
	public static void main(String[] args) {
		Medewerker a = new Programmeur();
		System.out.println(a.naam);
		a.werken();
		a.bedrijfsWerkzaamheden();
		System.out.println();
		Bedrijf b = new Programmeur();
		System.out.println(b.bedrijfsnaam);
		System.out.println(((Programmeur)b).naam);
		System.out.println(((Medewerker)b).naam);
		b.bedrijfsWerkzaamheden();
		
		Sporter c = new Programmeur();
		System.out.println(c.naamsport);
		
		Bedrijf d = new Medewerker();
	}
}
class Programmeur extends Medewerker implements Sporter{
	String naam = "naam in Programmeur";
	Programmeur(){
		programmeren();
	}
	void werken() {
		System.out.println("De programmeur programmeert, zijn naam is " + naam);
	}
	void programmeren() {
		System.out.println("De programmeur programeert Java");
	}
}
interface Bedrijf{
	String bedrijfsnaam = "AH";
	default void bedrijfsWerkzaamheden() {
		System.out.println("Werknemers voeren werkzaamheden uit");
	}
}
interface Sporter{
	String naamsport = "Voetballer";
	default void voetballen(){
		System.out.println("Dit is een voetballer");
	}
}