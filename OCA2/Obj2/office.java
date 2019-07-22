package oefeningen.OCA2.Obj2;

import oefeningen.OCA.package2.Person;

public class office {
	Person person = new Person("frank");
	
	public static void main(String[] args) {
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		e1.name = "Sylvan";
		e2.printEmp();
	}
}

class Employee{
	static String adress;
	String name;
	int age;
	Employee(){
		age = 22;
	}
	public void setName(String val) {
		name = val;
	}
	public void printEmp() {
		System.out.println("name = "+name+" age = "+age);
	}
	
}
