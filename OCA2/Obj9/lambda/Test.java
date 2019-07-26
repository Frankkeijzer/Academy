package oefeningen.OCA2.Obj9.lambda;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		Emp e1 = new Emp("Sonja", 5, 9999.20);
		Emp e2 = new Emp("Paul", 4, 1234.00);
		Emp e3 = new Emp("Harry", 5, 8769.00);
		Emp e4 = new Emp("Selvan", 1, 2769.00);
		
		ArrayList<Emp> empArrList = new ArrayList<>();
		empArrList.add(e1);
		empArrList.add(e2);
		empArrList.add(e3);
		empArrList.add(e4);
		
		System.out.println("Performance rate equals or greater 5: ");
		Validate validatePerfor = e -> e.getPerformanceRating() >= 5;
		filter (empArrList, validatePerfor);
		
		System.out.println("Probeersel: ");
		Validate validateName;
		System.out.println(validateName  = e ->  e.getName().startsWith("P")) ;
		
		System.out.println("\nName start with P: ");
//		Validate validateName = (Emp e) -> { return (e.getName().startsWith("P")); };
//		filter (empArrList, validateName);
	}
	static void filter (ArrayList<Emp> list, Validate rule) {
		for (Emp e : list) {
			if (rule.check(e)) {
				System.out.println(e);
			}
		}
	}
}

interface Validate{
	boolean check(Emp emp);
}

class Emp{
	String name;
	int performanceRating;
	double salary;
	Emp (String nm, int rating, double sal){
		name = nm;
		performanceRating = rating;
		salary = sal;
	}
	public String getName() { return name;}
	public int getPerformanceRating() { return performanceRating; }
	public double getSalary() {return salary; }
	public String toString() {
		return name + ":" + performanceRating + ":" +salary;
	}
}
//class ValidatePerformanceRating implements Validate{
//	public boolean check(Emp emp) {
//		return (emp.getPerformanceRating() >= 5);
//	}
//}