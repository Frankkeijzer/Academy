package oefeningen.week3.oefeningen;

public class even4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		statischeMethode.methode();
//		test2.andereMethode(); // dit gaat fout
		test2 t = new test2();
		t.andereMethode();
		
	}

}

class statischeMethode {
	static void methode() {
		System.out.println("Gelukt");
	}
}

class test2 {
	void andereMethode( ) {
		System.out.println("Kan alleen benaderd worden door instantieren klasse test");
	}
}