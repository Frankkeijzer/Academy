package oefeningen.OCA.package3;

public class OefenenObjecten {

	public static void main(String[] args) {
		// de statics via de class
		int q = test.c;
		int r = test.d;
		// maar ook:
		System.out.println(test.c);
		System.out.println(test.d);
		
		// final niet te wijzigen:
//		test.d = 35; //compile error, final field.
		test.c = 25;
		
		//nu objecten maken
		test t = new test();
		System.out.println(t.a);
		System.out.println(t.b);
		System.out.println(t.c); //compiler geeft al waarschuwing dat deze static is.
		System.out.println(t.d); //compiler geeft al waarschuwing dat deze static is, het mag wel
//		t.b=15; // compile error, final field.
		t.a = 50; // gaat prima
		t.c = 600; // compiler geeft een waarschuwing, het mag wel
		
	}

}
class test{
	int a;
	final int b = 10;
	static int c = 20;
	final static int d = 30;
}
