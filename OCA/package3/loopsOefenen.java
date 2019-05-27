package oefeningen.OCA.package3;

import java.util.ArrayList;

public class loopsOefenen {
//final static int finalint=1;
	public static void main(String[] args) {
		for (int a = 0, b=1, c=1, d = 10; a < d; a++, b++, c++, d--) {
			
		}
		int getal1 = 1;
		int getal2 = 3;
		int getal3;
		int getal4;
		if((getal3 = getal1) > (getal4 = getal2)) ;
		
//		boolean b1 = false;
//		boolean b2 = false;
//		if (b2 != b1 = !b2){
//			System.out.println("true");
//			} else {
//				System.out.println("false");
//			}
		
		if(getal1>4) System.out.println("1");
		System.out.println("2");
		//else System.out.println();
		
		Integer i =0;

		String s; // = (i<10)?"Ja":"Nee"; 
		if(( s = (i<10)?"Ja":"Nee") == "Ja");
		String kl = i>5?"Hallo":even.methode(2).toString();
		System.out.println(kl);
		
		Double dubbel = i>4?1.0:2.0;
		System.out.println(dubbel);
		
		int[] lijst = new int[5];
		lijst[1] = i>7?2:6;
		System.out.println(lijst[1]);
		
		int[] list2 = {1,2,3,4};
		System.out.println(list2);
		
		ArrayList<Integer> al = new ArrayList<>();
		al.add(1);
		al.add(3);
		al.add(5);
		System.out.println(al);
		
		
		int sw1 = 1;
		int sw2 = 2;
		int sw3 = 3;
		String input = "m";
		switch(input) {
		case "J":
			break;
		case "k":
			break;
		default:
			
		}
		
		int getalfor = 5;
		double getalfor2 = 6.0;
		for (int z =1,  j=5 ;z<j ;z++,j--, getalfor2++ ) {}
		
		//for(;;)System.out.println(1); //infinity loop
		
		for (int hrs = 1; hrs <= 1; hrs++) {
			for (int min = 1; min<=60; min++) {
				System.out.println(hrs + ":" + min);
			}
		}
	}

}

class even{
	static Integer methode (int getal) {
		return getal;
		//return "Doei";
	}
}
