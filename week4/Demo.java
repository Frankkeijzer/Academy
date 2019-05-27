package oefeningen.week4;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Koffie();
		new Koffie();
		new Koffie();

	
	}

}

class Arabic extends Koffie{
	static {
			System.out.println("static in arabic");
	}
	
	{
		System.out.println("object in arabic");
	}
	
	Arabic(){
		System.out.println("constructor in arabic");
	}
	
}


class Koffie{
	int prijs;
	String Smaak;
	
	Koffie() {
		System.out.println("in constructor");
	}
	
	void drinken() {
		
	}
	
	private void Koffie() {
		// TODO Auto-generated method stub
		
	}

	static { //initialiserblock
		System.out.println("hallo allemaal static");
	}
	
	{ //initialiserblock
		System.out.println("hoi in object");
	}
	
}