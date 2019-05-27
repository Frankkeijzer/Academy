package oefeningen.OCA.package2;

public class Tellen {
	public static void main(String[] args) {
//		int a=10;
//		long b = 20;
//		float e = 20.0f;
//		double f = 20.0;
//		float g = a;
//		System.out.println(g);
//		
//		int mychar =97;
//		int yourchar =98;
//		System.out.println(((char)mychar) + ((char)yourchar));
//		System.out.println((mychar) + (yourchar));
//		
		char chara = 97;
		char charb = 98;
		char charc = 'c';
		System.out.println((char) (chara + charb));
//		
//		boolean z = true;
//		boolean y = false;
//		boolean q = y||z;//|| y;
//		System.out.println(q);
//		
//		String str = "123";
//		boolean h = false;
//		System.out.println(str+=h);
		
		int k = 9;
		char l = 'a';
		System.out.println(l+=k);
		
		StringBuilder ad = new StringBuilder("snorkler");
		StringBuilder SB = new StringBuilder ("yoodler");
		ad.append(SB.substring(2,5).toUpperCase());
		System.out.println(ad);
		System.out.println(SB);
		
		
//		Boolean buy = new Boolean(true);
//		Boolean sell = new Boolean(true);
//
//		boolean buyPrim = buy.booleanValue();
//		System.out.println(buyPrim);
		
		System.out.println(Integer.MAX_VALUE);
	}
}

 