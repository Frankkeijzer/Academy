package oefeningen.week3.oefeningen;

public class even3 {
	public static void main(String[] args) {
		Employee werknemer = new programmer();
		programmer prg1 = new programmer();
		prg1.writecode();
		Employee prg2 = new programmer();
		
	}
}
 class Employee {
	 String name;
	 String adress;
	 String phoneNunber;
	 float experience;
	
 }
 
 class programmer extends Employee{
	 String[] programmingLanguages;
	 void writecode() {}
 }
 
 class Manager extends Employee{
	 int teamSize;
	 void reportProjectStatus() {}
 }