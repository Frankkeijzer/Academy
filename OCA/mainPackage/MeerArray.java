package oefeningen.OCA.mainPackage;

import java.util.ArrayList;

public class MeerArray {

	public static void main(String[] args) {
		
		int[] cijfers = new int[] {2,4,5,7,8};
		
		ArrayList<Integer> aanvullijst = new ArrayList();
		for (int elem : cijfers) {
			aanvullijst.add(elem);
			}
		
		ArrayList<Integer> twee = new ArrayList();
		for (int i = 10; i < 15; i++) {
			twee.add(i);
		}
		System.out.println(twee);
		
		twee.addAll(aanvullijst);
		System.out.println(twee);
		
		ArrayList<String> strLijst = new ArrayList<>();
		strLijst.add("een");
		strLijst.add("twee");
		strLijst.add("drie");
		System.out.println(strLijst.contains("twee"));
		String getal;
		System.out.println(strLijst.contains(getal = new String("een")));
		System.out.println("getal " + getal);

		//strLijst.clear();
		//System.out.println(strLijst);
		
		System.out.println(cijfers.toString());
		
		StringBuilder SBeven = new StringBuilder("eenwoord");
		CharSequence even2 = SBeven.subSequence(2, 5);
		System.out.println(SBeven);
		System.out.println(even2);
		
		String str2 = "Klaar";
		char str1 = "Klaar".charAt(0);
		System.out.println(str1);
		System.out.println("Klaar".charAt(0));
		System.out.println(str2.charAt(0));
		System.out.println(str2);
		System.out.println(str2.indexOf("aa"));
		System.out.println(SBeven);
		//SBeven.delete(0, 3);
		//System.out.println(SBeven);
		
		
		
	}

}
