package oefeningen.OCA2.Obj5;

public class Zolang {

	public static void main(String[] args) {
		int a = 10;
		while(a!=0) { 
		getallenreeks(a);
		System.out.println(a--);
		}
		System.out.println("hallo");
		
	}
	static int getallenreeks(int a) {
		int optellen = a + a;
		System.out.println(optellen);
		return optellen;
	}
}
