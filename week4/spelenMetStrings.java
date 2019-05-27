package oefeningen.week4;

public class spelenMetStrings {

	public static void main(String[] args) {
		String hallo1 = "Hallo";
		String hallo2 = "Hallo";

		System.out.println("h1 == h2 " + hallo1 == hallo2); //levert false op, want eerst ga je "h1 == h2" en "Hallo" aan elkaar plakken, 
															//daarna ga je dat vergelijken met Hallo
		System.out.println(hallo1 == hallo2); //true
		System.out.println("h1 == h2 " + (hallo1 == hallo2)); // wel true
		

		String hallo3 = new String("Hallo");
		System.out.println("h1 == h3 " + (hallo1 == hallo3)); // false, want nieuw object gecreeerd
		
		String hallo4 = "Hal" + "lo"; // De compiler is hier zo intelligent dat hij de toewijzging meteen kan doen en de 2 constanten direct samentrekt.
		System.out.println("h1 == h4 " + (hallo1 == hallo4)); //true
		
		String hal = "Hal";
		String lo = "lo";
		String hallo5 = hal+lo; //Tijdens het runnen wordt hallo5 geset en is altijd een nieuw object.
		System.out.println("h1 == h5 " + (hallo1 == hallo5)); //false
		
		
		final String halFinal = "Hal";
		final String loFinal = "lo";
		String hallo6 = halFinal+loFinal;
		System.out.println("h1 == h6 " + (hallo1 == hallo6)); //true
		
		final String halFinal2; 
		halFinal2 = "Hal";
		final String loFinal2;
		loFinal2= "lo";
		String hallo7 = halFinal2+loFinal2; 
		System.out.println("h1 == h7 " + (hallo1 == hallo7)); //false
		
		String hallo8 = "" + 'H'+ 'a'+ 'l'+ 'l'+ 'o'; 
		System.out.println("h1 == h8 " + (hallo1 == hallo8)); //true
		
		
		
	}

}
