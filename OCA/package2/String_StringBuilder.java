package oefeningen.OCA.package2;

public class String_StringBuilder {

	public static void main(String[] args) {
//		System.out.println("hallo".concat(" Doei"));
//		String str = "bla";
//		
		String nummer = "0123456789";
//		System.out.println(nummer.substring(1, 5));
//		System.out.println(nummer.substring(1));
		System.out.println(nummer.substring(1,10));
//		
//		System.out.println(nummer.replace('5', 'A'));
//		System.out.println(nummer.replace("0123", "ABCD"));
//		System.out.println(nummer.length());
//		System.out.println(nummer.charAt(0));
//		System.out.println(nummer.indexOf("9"));
//		
//		String nummer2 = "appel";
//		System.out.println(nummer2.indexOf("pp"));
//		System.out.println(nummer2.startsWith("l"));
		
		System.out.println("\nStringBuilder");
		StringBuilder SB1 = new StringBuilder ("0123456789");
		System.out.println(SB1);
		//System.out.println(SB1.delete(1,1));
		System.out.println( SB1.reverse().subSequence(1, 5));
		
		
	}

}

class test{
	static String a = "mooi";
	static void methode1() {
		System.out.println(a);
	}
}