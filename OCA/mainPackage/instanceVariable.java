package oefeningen.OCA.mainPackage;

public class instanceVariable {
	public static void main(String[] args) {
//		System.out.println(Persoon.land);
//		//System.out.println(Persoon.naam);
//		Persoon p3 = null;
//		System.out.println(p3.land);
		
		Persoon p = new Persoon();
		Persoon p2 = new Persoon();
		p.naam = "Frank";
//		p2.naam = "Hendrika";
		p.naamNoemen();
//		p2.naamNoemen();
//		System.out.println(Persoon.land);
//		System.out.println(p2.land); // bad practice
//
//		p.land = "Duitsland";
//		System.out.println(p.land);
//		System.out.println(p2.land);
//		
//		//System.out.println(Persoon.inwoner);
//		p.rekenen(2);
	}
}

class Persoon {
	//static String naam;
	private static String nationaliteit= "Nederlandse";
	static String land = "Nederland";
	String naam;
	
	void naamNoemen(){
			String nationaliteit = "Duitse";
			String land = "Duitsland";
			
			//System.out.println("Naam van de Persoon = " + naam);
			System.out.println("klasse nationaliteit: " + this.nationaliteit);
			System.out.println("klasse land " + this.land);
			System.out.println();
			
			System.out.println("methode nationaliteit: " + nationaliteit);
			System.out.println("methode land " + land);
			System.out.println();

			if (nationaliteit.equals("Duitse") || nationaliteit.contentEquals("Nederlandse")) {
					nationaliteit = "Belgisch";
					System.out.println("In de if " + nationaliteit);
			} else {
					nationaliteit = "Frans";
					System.out.println("in de else " + nationaliteit);
			}
			return;
			
		}
	
	static void naamNoemen2() {
		//System.out.println("Naam van de Persoon = " + this.naam);
		
	}

	void rekenen (int getal)	{
		
		int getal2 = getal * getal;
		System.out.println("input " +getal);
		if (getal<getal2) {
			System.out.println(getal2);
		}
		for (int i =0; getal>i;i++) {
			System.out.println(getal);
			System.out.println(i);

		}
	}
}

