package oefeningen.OCA2.Obj9;

import java.util.*;

public class Arrlijst {
	public static void main(String[] args) {
		ArrayList aL = new ArrayList<pipoo>();
		
		pipoo abram = new pipoo();
		
		ArrayList AB;
		AB = new ArrayList<Integer>();
		AB.add(1);
		AB.add("String");
		AB.add(4.5);
		AB.add(new pipoo());
		AB.add(abram);
		AB.add(0,"Hallo");

		Iterator<pipoo> itt = AB.iterator();
		while (itt.hasNext()) { 
            System.out.print(itt.next() + ", "); 
		}
		
		System.out.println("\n"+AB);

		System.out.println(AB.size());
		
	}
}
class pipoo{}



