package oefeningen.boekOCA;

public class Tolls {
	private static int yesterday = 1;
	final int a;
	int tomorrow = 10;
	
	Tolls(){
	a=4;	
	}
	public static void main(String[] args) {
			Tolls tolls = new Tolls();
			int today=20, tomorrow=40;
			System.out.println(today+tolls.tomorrow+tolls.yesterday);
	}

}
