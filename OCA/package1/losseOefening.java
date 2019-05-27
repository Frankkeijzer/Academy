package oefeningen.OCA.package1;

public class losseOefening {

	public static void main(String[] args) {
		losseOefeningKlasse1 vb = new losseOefeningKlasse1();
		//losseOefeningKlasse1 vb2 = new losseOefeningKlasse1("Frank");
		
		klasse2 kl = new klasse2();
		System.out.println();
		klasse1 kl3 = new klasse2();
		
		System.out.println();
		klasse1 kl4 = new klasse1();
		
		System.out.println();
		klasse1 kl5 = new klasse1("Frank");
		
		System.out.println();
		klasse1 kl6 = new klasse1(2);
	}

}

class klasse1{
	klasse1(){
		System.out.println("constructor klasse1");
	}
	klasse1(String naam){
		this();
		System.out.println("constructor klasse1 met String " + naam);
	}
	klasse1 (int getal){
		this("Hendrika");
		System.out.println("ik weet het even niet " + getal);
	}
}

class klasse2 extends klasse1 {
	klasse2(){
		System.out.println("constructor klasse2");
	}
}