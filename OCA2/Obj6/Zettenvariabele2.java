package oefeningen.OCA2.Obj6;

public class Zettenvariabele2 {
	public static void main(String[] args) {
		System.out.println(methode2(9));
		int q = methode((short) 8);
		
		short b = (short) methode2(4);
		double c = methode2(6);
		System.out.println(c);
		
		float d = methode2(10);
		System.out.println(d);
		
		float e = methode3();
		double f = methode3();
		int g = (int) methode3();
		
	}
	static short methode (short a) {
		short b=(short) (a+a);
		return b;
	}
	static int methode2 (int a) {
		int b = a+a;
		return b;
	}
	static float methode3() {
		float a =17.0f;
		return a;
	}
	
}

class testeven{
	int geef5() {
		return 5;
	}
}

class testeven2 {
	void geef6() {
		int a = 6;
		return;
	}
}