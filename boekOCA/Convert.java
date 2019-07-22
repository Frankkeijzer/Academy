package oefeningen.boekOCA;

public class Convert {

	public static void main(String[] args) {
		Integer a = 10;
		Convert c = new Convert();
		c.convert(a);
		Person person = new Person();
		c.convert(person);
		System.out.println(c);
	}

	public String convert(Object value) {
		return value.toString();
	}
}

class Person{}