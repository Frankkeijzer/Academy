package oefeningen.OCA.package2;

public class Test {
	public static void swap (Person p1, Person p2) {
	Person temp = p1;
	p1 = p2;
	p2 = temp;
	} 
//	resetValueOfMemberVariable (Person p1) {
//		p1.setName("Rodrigue");
//	}
	
	
	public static void main(String[] args) {
		Person person1 = new Person("John");
		Person person2 = new Person("Paul");
		System.out.println(person1.getName() + " : " + person2.getName());
		swap(person1, person2);
		System.out.println(person1.getName() + " : " + person2.getName());

		
		Dier ga = new Dier();
		//System.out.println(ga.getal);
//		Person person1 = new Person("John");
//		System.out.println(person1.getName());
//		resetValueOfMemberVariable(person1);
//		System.out.println(person1.getName());
	}

}


class Dier {
	private int getal=1;
}

class Schaap{
	Dier beer = new Dier();
	
}

