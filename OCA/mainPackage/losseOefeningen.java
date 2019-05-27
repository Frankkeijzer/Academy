package oefeningen.OCA.mainPackage;

import java.util.ArrayList;

public class losseOefeningen {

	public static void main(String[] args) {
		Integer[] opslag;
		opslag = new Integer[] {1,2,3,4,5};
		//opslag = {1,2,3,4,5,6};
		//opslag = new String[] {"a","b"};
		
		String[] opslag2 = {"Hier ", "zijn ", "we"};
		int[] opslag3 = new int[] {5,6,7,8};
		
		for (int elem:opslag) {
			System.out.println(elem);
		}
		System.out.println();
		
		System.out.println();
		for (int i = 0; i<opslag.length; i++) {
			opslag[i]+=1;
			System.out.println(opslag[i]);
		}
		System.out.println("-------------------------");
		
		
		ArrayList<String> lijst = new ArrayList<>();
		//ArrayList<int> lijst2 = new ArrayList<>();
		
		ArrayList<Integer> AL = new ArrayList();
		AL.add(1);
		AL.add(5);
		
		for (Object getal:AL) {
			System.out.println("getal in AL: " + getal);
			}
		
		//AL.addAll(opslag);
		
		for (Object getal:AL) {
			System.out.println("getal in AL: " + getal);
			}
/*		
//spelen met String wrapper en primitives		
		System.out.println("\n");
		String String;
		String = "Weg";
		int getal;
		getal = 1;
		Integer getal1;
		getal1 = 2;
		//getal1 = "Hallo";
		
		Integer getal2 = new Integer(3);
		System.out.println(getal2);
		//Short getal3 = new Short(1);
*/




/*		
//Spelen met objecten		
		Object even;
		even = "Hallo wereld";
		System.out.println(even);
		
		Object even2;
		even2 = 4.0;
		System.out.println(even2);
		
		Object even3;
		even3 = 2;
		System.out.println(even3);
		even3 = "Hallo";
		System.out.println(even3);
		
		
		//Spelen met de klasse Object en new
		Object a= new Object();
		Object c = a;
		System.out.println("a: "+a);
		System.out.println("c: "+c);
		System.out.println("a gelijk aan: "+ a.equals(c));

		Object b = a.toString();
		System.out.println("b: " + b);
		System.out.println("a gelijk aan b, na toString: "+ a.equals(b));
		
		b = "Doei";
		System.out.println("b na vullen met Doei: "+ b);

		b= "hallo";
		System.out.println(b);
*/		
		
		
		
	}

}
