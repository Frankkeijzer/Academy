package oefeningen.week4;

import java.util.stream.Stream;

public class even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "Hallo";
		//String b += a;
		
		//System.out.println(b);
		
		int c = 1;
		//int d += 1;
	
	Stream.of(3,4,8,9).filter(e -> e <5).forEach(System.out::println);
	
	Berekening jojo = (y,r) -> y+r;
	Berekening jojo2 = (q , t) -> q-t;
	Rekenmachine rm = new Rekenmachine();
	rm.uitrekenen(jojo, 6, 9);
	rm.uitrekenen(jojo2,15, 6);
	
	}

}

class Rekenmachine{
	void uitrekenen(Berekening aq, int a, int b) {
		int t = aq.berekenen(a,b);
		System.out.println(t);
	}
}

interface Berekening{
	int berekenen(int a, int b);
}