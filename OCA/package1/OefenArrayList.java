package oefeningen.OCA.package1;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Iterator;


public class OefenArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> intlijst = new ArrayList<>();
		
		ArrayList<String> stringLijst = new ArrayList<>();
		stringLijst.add("Hallo");
		stringLijst.add("Java");
		stringLijst.add("laten");
		stringLijst.add("we");
		stringLijst.add("programmeren");
		
		stringLijst.listIterator();
		
		ListIterator<String> iterator = stringLijst.listIterator(); 
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println();
		//stringLijst.clear();
		
		for (String elem:stringLijst) System.out.println(elem);
		
		System.out.println();

		for (int i =0;i<stringLijst.size();i++) System.out.println(stringLijst.get(i));

		System.out.println();

		Iterator<String> even = stringLijst.iterator();
		
		while (even.hasNext()) {
			System.out.println(even.next());
		}
		
		
		//lijstje2 = stringLijst.clone();
	
	}

}
