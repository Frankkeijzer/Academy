package oefeningen.OCA2.Obj7.Office;
class Employee{
	String name = "Employee";
	void printName() {
		System.out.println(name);
	}
}
class Programmer extends Employee {
	String name = "Programmer";
	void printName() {
		System.out.println(name);
	}
}
public class Office1 {
	public static void main(String[] args) {
		Employee emp = new Employee();
		Employee programmer = new Programmer();
		
		System.out.println(emp.name);
		System.out.println(programmer.name);
		emp.printName();
		programmer.printName();
	}
}
