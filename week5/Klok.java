package oefeningen.week5;

public class Klok {
	public static void main(String[] args) throws InterruptedException {
		for (int h = 0; h < 24 ; h++) {
			for (int m = 0 ; m < 60; m++) {
				for (int s = 0; s < 60; s++) {
					Thread.sleep(1000);
					System.out.println(h+":"+m+":"+s);
				}
			}
		}
	}
}
