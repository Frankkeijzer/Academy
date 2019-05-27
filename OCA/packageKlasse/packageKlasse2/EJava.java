package oefeningen.OCA.packageKlasse.packageKlasse2;

public class EJava {
	public static void main(String[] args) {
		Person person = new Person();
		Moveable moveable = x -> Person.MIN_DISTANCE + x;
		System.out.println(moveable.move(20));
	}
}
 class Person{
	 static int MIN_DISTANCE = 5;
	 int age;
	 float height;
	 boolean result;
	 String name;
 }
 
 interface Moveable{
	 int move(int distance);
 }