package oefeningen.OCA.package2;

public class TenaryConstruct {
	public static void main(String[] args) {
		
		int var = 4;
		String var2 = var < 2 ? "Ja" : "Nee";
		String var3 = methoderekenen(2)< 10 ? methodeantw1() : methodeantw2();
		System.out.println(var3);

		String bool1 = var < 3 ? 
				10 < 5 ? 
						"1" : 6 == 12? 
								"2" : "3" : 
				"4";
		
		
		System.out.println(bool1);
		
//        int a = 10;
//        int b = 20;
//        int c = 30;
// 
//        String result = a > b ? a > c ? "a is greatest" : "c is greatest" : b > c ? "b is greatest" : "c is greatest";
//		
//		int amount = 10;
//		String result = amount <= 2 ? "couple" : amount > 2 && amount < 5 ? "few" : amount <= 5 ? "several" : "many";
//		System.out.println(result);
	}

	static int methoderekenen(int var1) {
		int resultaat = var1 * 2;
		return resultaat; 
	}	

	static String methodeantw1() {
		return "groter";
	}
	
	static String methodeantw2( ) {
		return "kleiner";
	}
	
}


