package oefeningen.OCA2.Obj5;

public class forLoop {
	public static void main(String[] args) {
		for(int a=1; a < 10;a++) System.out.println(a);

		for (int a = 0; a<5;a++) tonen();
		
		int ctr = 0;
		for (;ctr<5;ctr++) System.out.println(ctr + " in loop");
		System.out.println(ctr + " buiten loop");
		
		
		for (int a=0,b=2, c=5;a<5;a++, b--,c=a*b)System.out.println("a " + a + " b "+ b + " c");
		
		for(init();init()<5;ctr++) System.out.println("ctr");
		
	}
	
	static void tonen() {
		System.out.println("hallo");
	}
	
	static int init() {
		return 1;
	}
}
