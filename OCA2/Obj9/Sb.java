package oefeningen.OCA2.Obj9;

import java.util.*;

import oefeningen.OCA.package2.String_StringBuilder;
import oefeningen.boekOCA.ArrayLijst;

public class Sb {
	public static void main(String[] args) {
		System.out.println(new StringBuilder("radical").delete(1, 100).append("obots").insert(1, "adical r"));
		
		List<Character> chars = new ArrayList<>();
		chars.add('a');
		chars.add('b');
		chars.set(1, 'c');
		chars.remove(0);
		System.out.println(chars.size());
		
		
		List<Integer> ballon = new ArrayList();
//		ArrayList<> bla = new ArrayList(); // aan de refence zijde moet de generic (diamond) gevuld zijn met een type
		
		StringBuilder Sb = new StringBuilder("Hallo");
		System.out.println(Sb.substring(2) instanceof String);
		
		System.out.println(Sb.subSequence(2,5));
		System.out.println(Sb.substring(2,5));
		
		
//		System.out.println(Sb.capacity());
//		Sb.trimToSize();
//		System.out.println(Sb.capacity());
//		Sb.setLength(2);
//		System.out.println(Sb);
//		Sb.insert(1, 'a');
//		Sb.append("abcd", 1,2);
		
		
		System.out.println(Sb);
		
		
		
		String g = "ababa";
g.indexOf('a');
System.out.println(g.indexOf('b'));

//
//	String ggg = new String();
//	ggg.charAt(0);
	
	}
}
