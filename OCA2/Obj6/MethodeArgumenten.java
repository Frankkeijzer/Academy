package oefeningen.OCA2.Obj6;

public class MethodeArgumenten {
	public static void main(String[] args) {
		methode(1,2,3,4,5,6);
		methode2(1,2,"+","-","*","/");
	}
	
	static void methode(int ... getallen){
		for (int getal: getallen) System.out.println("Het getal in de verzameling getallen is: "+ getal);
		System.out.println("Getal op de eerste plaats: "+ getallen[0]);
		System.out.println("Aantal getallen in de verzameling getallen: "+getallen.length);
		System.out.println("Getal op de laatste plaats: "+getallen[getallen.length-1]);
	}
	
	static void methode2 (int a, int b, String ... namen) {
		for (String naam : namen) {
			System.out.println(a + naam + b);
			return;
		}
	}
	
	static void methode3(int a, double b) {}
	static void methode3(double b, int a) {}
}
