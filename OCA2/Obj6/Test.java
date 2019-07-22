package oefeningen.OCA2.Obj6;

public class Test {
	
	public static void resetValueOfMemberVariable(Person p1) {
		p1.setName("Roger");
	}
	
	public static void swap(Person p1, Person p2) {
//		Person temp = p1;
//		p1 = p2;
//		p2 = temp;
		Person temp = p1;
		Person temp2 = new Person(p2.getName());
		p1.setName(temp2.getName());
		p2.setName(temp.getName());
	}
	
	public static void main(String[] args) {
		Person person1 = new Person("John");
		Person person2 = new Person("Sara");
		System.out.println(person1.getName());
		System.out.println(person2.getName());

		swap(person1, person2);
		System.out.println(person1.getName());
		System.out.println(person2.getName());

		
		resetValueOfMemberVariable(person1);
		System.out.println(person1.getName());
	}
}
class Person{
	private String name;
	Person(String newName){
		name = newName;
	}
	public String getName() {
		return name;
	}
	public void setName(String val) {
		name = val;
	}
}
