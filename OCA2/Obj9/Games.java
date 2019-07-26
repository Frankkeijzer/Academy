package oefeningen.OCA2.Obj9;

import java.util.*;

public final class Games {
	public final static int finish( int score) {
		final int win = 3;
		 int result = score++ < 5 ? 2: win;
		return result+=win;
	}
	public static void main(String[] args) {
		System.out.println(finish(Integer.parseInt(args[0])));
		List balloons = new ArrayList();
		ArrayList bslo = new ArrayList();
		bslo.add("String");
		bslo.add(2);
		
		ArrayList<String> hallo = new ArrayList<>();
		hallo.add("2");
		
		ArrayList beh = new ArrayList<String>();
		beh.add(1);
	}
	
	void voorbeel(ArrayList a) {
		a.add(1);
		a.add("Stringg");
	}
	
}
