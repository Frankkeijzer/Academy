package oefeningen.OCA.package1;

public class OefenenArrays {
	public static void main(String[] args) {
		String[] objarray = new String [ ] {"Paul", "Jan", "Klaas"};
		//String naam = new String(objarray[1]);
		String naam = objarray[1];
		System.out.println("naam uit array in variabele naam: " + naam);
		System.out.println(naam == objarray[1]);
		objarray[1] = "Peter";
		System.out.println("naam na wijziging array: "+ naam);
		for (String elem:objarray) System.out.println("inhoud array: "+ elem);
		
	}
}

class lijstje{
	lijstje[] list;
	
	void methode() {
	}
	
}