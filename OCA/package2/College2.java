package oefeningen.OCA.package2;

public class College2 {

	public static void main(String[] args) {
		Phone phone = new Tablet();
//		System.out.println(phone.keyboard + ":" + phone.playMovie);
		phone.geluid();
		
		Tablet tablet = new Tablet();
		System.out.println(tablet.keyboard + ":" + tablet.playMovie);
		
		Phone phone2 = new Phone();
//		System.out.println(phone2.keyboard + ":" + phone2.playMovie);
		
		Roamable var = (Roamable) new Phone(); // casten om via de erfrelatie te gaan van Tablet
		Roamable var2 = new Tablet(); // via de eigen erfrelatie
		Roamable var3 = (Roamable)new Phone(); // volledig via de erfrelatie
		
	}
}
class Computer{}

class Phone extends Computer{
	String keyboard = "in-built";
	void geluid() {System.out.println("piep");}
}

class Tablet extends Phone implements Roamable{
	boolean playMovie = false;
	void geluid() {System.out.println("zoem");}

}

interface Roamable{}
