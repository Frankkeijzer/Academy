package oefeningen.OCA.package1;

public class oefenenString {

	public static void main(String[] args) {
//		String st1 = "Hallo";
//		System.out.println("Hallo" == st1);
//		
//		String str2 = new String("Doei");
//		System.out.println("Doei" == str2);
//		
//		StringBuilder SB1 = new StringBuilder("Klaar");
//		String str3 = new String(SB1);
//		
//		String str4 = new String();
//		System.out.println(str4);
//		
//		//st1.compareTo(str2);
//		//System.out.println(st1.compareTo(str2));
//
//		String letters = "ABCAB";
//		System.out.println(letters.indexOf('B',3));
//		
//		String result = "Sunday  ".replace("  ", "Z").trim().concat("M n");
//		System.out.println(result);
//		
//		System.out.println(12+10+"ABC");
//		System.out.println("ABC " + 10 + 12);
//		"H".equals("H");
//		System.out.println("H".equals("H"));
//		System.out.println();
//		
//		StringBuilder sb10 = new StringBuilder(2);
//		sb10.insert(0, "hallooo");
//		System.out.println(sb10);
//		
//		StringBuilder sb11 = new StringBuilder("         hallo          ");
//		System.out.println(sb11);
//		
//		StringBuilder sb12 = new StringBuilder("Patrijsweg");
//		System.out.println(sb12.substring(0,7));
//		System.out.println(sb12.subSequence(0, 6));
//		System.out.println(sb12);
//		System.out.println(sb12.append(" nummer 11"));
//		System.out.println(sb12);
//		sb12.insert(3, 'h');
//		System.out.println(sb12);
		
		String k1 = "Blooper";
		StringBuilder k34 = new StringBuilder(k1);
		k34.append(k1.substring(4)).delete(3, 5);
		System.out.println(k34);
		
		
	}

}
