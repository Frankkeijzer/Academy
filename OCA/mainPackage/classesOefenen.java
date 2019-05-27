package oefeningen.OCA.mainPackage;

public class classesOefenen {
	public static void main(String[] args) {
		Person persoon3 = new Person();
		//persoon3.even();
		Person persoon;
		persoon = new Person();
		persoon.weetNiet();
		
		System.out.println(persoon.proberen3(2));
		
		Person persoon4 = new Person("frank");
		Person.variable = "bla";
		
	}
}
 class Person{
	static String variable;
	 
	 Person(){
		
	}
	
	Person(String name){
		
	}
	
	void even() {
		System.out.println("hallo");
		}
	void weetNiet( ) {
		this.even();
	}
	
	public String proberen() {
		String naam ="Judith";
		return naam;
	}
	
//	private String proberen() {
//		String naam ="Judith";
//		return naam;
//	}
	
	
//	int proberen() {
//		int getal =0;
//		return getal;
//	}
	
	void proberen(String naam) {
		System.out.println(naam);
	}
	
	void proberen (int leeftijd) {
		System.out.println(leeftijd);
	}
	
	int proberen2() {
		byte j = 2;
		return j;
	}
	
	void setWeight (double val) {
		double weight = 0;
		if( val < -1) return;
		weight = val;
	}
	
	int proberen3 (int ...getallen) {
		int getal = 0;
		for (int elem : getallen) {
			getal = elem * elem;
		}
		this.proberen();
		return getal;
	}
	
}
class ObjectLifeCycle{
	void methode() {
		Person persoon = null;
		persoon = new Person();
		Person persoon2 = new Person();
		
	}
}