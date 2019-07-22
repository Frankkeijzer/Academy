package oefeningen.OCA2.Obj6;

public class finale {
	static int a;
	int b;
	static String c;
	String d;
	
	static void methode5() {
		a = 5;
//		b = 10;
		c = "Hallo";
//		d = "Doei";
//		methode6();
	}
	
	void methode6() {
		a = 10;
		b = 15;
		methode5();
	}
}
class proberen extends finale{
//	void methode5() {	}
}
