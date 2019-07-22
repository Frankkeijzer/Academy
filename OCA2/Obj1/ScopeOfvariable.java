package oefeningen.OCA2.Obj1;

public class ScopeOfvariable {
String a;
	public static void main(String[] args) {
		int a = 1;
		if(a<2) {
			a++;
			int b = a;
			System.out.println(b);
		}
		System.out.println(a);
//		System.out.println(b); // b is buiten de if niet beschikbaar
		String b = "Hallo Java";
		System.out.println(b); // b is gewoon te gebruiken buiten de if
		methode(2,3,"hallo");

		NieuweKlasse.adres = "Plein 1";
		NieuweKlasse.bedrijfsnaam = "NN";
		
		System.out.println(NieuweKlasse.bedrijfsnaam + " " + NieuweKlasse.adres);

		
		NieuweKlasse klasse = new NieuweKlasse();
		klasse.methodeInKlasse();
		klasse.naam = "Jan";
		klasse.leeftijd = 45;
		// beide variabele zijn nu beschikbaar
		System.out.println(klasse.naam  + " " + klasse.leeftijd);
		System.out.println(klasse.bedrijfsnaam + " " + klasse.adres);
		
		klasse.bedrijfsnaam = "ing";
		
		System.out.println("aangepast object "+klasse.bedrijfsnaam + " " + klasse.adres);
		
		klasse = null;
		// nu is klasse "leeg" en dus zijn de variabelen niet meer beschikbaar.
//		System.out.println(klasse.naam  + " " + klasse.leeftijd);
		
			
		System.out.println("aangepast klasse "+ NieuweKlasse.bedrijfsnaam + " " + NieuweKlasse.adres);
		
	}

static void methode(int a, int b, String c) {
//	int c = a; // a is niet beschikbaar buiten de main
//	int a; // dit kan niet want het is al een methode variabel
	int d = a * b;
	System.out.println("a * b = " + d);
	System.out.println("Je hebt " + c + " aan de methode meegegeven als String");
}

}


class NieuweKlasse{
	String naam = "Frank"; // object variabele
	int leeftijd = 40; // object variabele
	
//	String bedrijfsnaam; // kan niet want is al objectvariabel
	
	static String bedrijfsnaam; // klasse variabele
	static String adres; // klasse variabele
	
//	static String naam; //kan niet want is al object variabele
	
	void methodeInKlasse() {
		String naam = "Pietje Puk"; // dit mag wel, shadowing
		System.out.println(naam + " " + leeftijd); // object variabelen zijn gewoon beschikbaar voor methodes in de klasse
	}
}