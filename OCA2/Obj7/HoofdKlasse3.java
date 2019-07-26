package oefeningen.OCA2.Obj7;

public class HoofdKlasse3 {
	public static void main(String[] args) {
		SuperPipo p1 = new SuperPipo();
		System.out.println("SuperPipo: " + p1.naam + " " + p1.leeftijd);
		p1.methodeLachen();
		System.out.println(p1.breedteberekenen(2));
		System.out.println("============================");
		SuperPipo p2 = new SubPipo();
		System.out.println("SubPipo: " + p2.naam + " leeftijd " + p2.leeftijd + " lengte - casten " + ((SubPipo)p2).lengte);
		p2.methodeLachen();
		System.out.println(((SubPipo)p2).methodeOuderWorden(3));
		System.out.println(p2.breedteberekenen(2));
		System.out.println("============================");
		SubPipo p3 = new SubPipo();
		System.out.println("SubPipo: " + p3.naam + " " + p3.leeftijd);
		p3.methodeLachen();
		System.out.println(p3.methodeOuderWorden(3));
		System.out.println(p3.breedteberekenen(2));

		System.out.println("=============================");
		
	}
}
class SuperPipo{
	String naam = "Pipo";
	int leeftijd = 10;
	int breedte = 10;
	
	void methodeLachen() {
		System.out.println("JoepiedePoepie");
	}
	int breedteberekenen(int input) {
		return input * breedte;
	}
}
class SubPipo extends SuperPipo{
	String naam = "De kleine";
	int leeftijd = 4;
	int lengte = 85;
	int breedte = 20;

	void methodeLachen() {
		System.out.println("hahahaha");
	}
	int breedteberekenen(int input) {
		return input* breedte;
	}
	int methodeOuderWorden(int leeftijd) {
		return leeftijd + 1;
	}
	
}