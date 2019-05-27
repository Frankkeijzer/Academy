package oefeningen.OCA.package3;

public class LoopsLes {

	public static void main(String[] args) {
		
		int a = 18;
		int b = 34;
		doMT: while(true) {
			for(;a<21;++a, b+=2) {
				if (a==20) {
					break doMT;
					
				} else {
					System.out.println(b);
				}
			}
		}
		System.out.println(a);
	}
	
}
