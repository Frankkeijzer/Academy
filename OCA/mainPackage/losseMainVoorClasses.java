package oefeningen.OCA.mainPackage;

public class losseMainVoorClasses {
	public static void main (String[] args) {
		klasse1 output = new klasse1();
		output.methode1();
		
		klasse1 voorbeeld;
		voorbeeld = new klasse1();
		voorbeeld.methode1();
		
		klasse2 klasse;
		klasse = new klasse2();
		//Klasse2 variabeleKlasse = new Klasse2() {public void interfaceMethode() {}};
		
		nieuwInterface variabeleInterface = new nieuwInterface() {public void interfaceMethode() {System.out.println("Dit is interfaceMethode van nieuwInterface" );}};
		variabeleInterface.interfaceMethode();
		
		//klasse2 variabeleKlasse = new klasse2( ) {void methode3(){String[] myStringArray = new String[] {"Hallo ","dit ", "is ", "de ","array ","myStringArray"};}};

		klasse3 variabeleKlasse1 = new klasse3( ) ;
		variabeleKlasse1.methode4();
	}
	
}

class klasse3{

	public void methode4() {
		System.out.println("Dit is methode 4 van klasse3" );	
	}
}


class klasse2 {

	//@Override
	//public void interfaceMethode() {
		// TODO Auto-generated method stub
		
	}
	
