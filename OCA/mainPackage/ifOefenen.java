package oefeningen.OCA.mainPackage;

public class ifOefenen {
	public static void main(String[] args) {
		int i = 1;
		int j = 5;
		if(i<j) System.out.println("Hallo");
		
		System.out.println("uit de if");
	
		String s = i<j?"kleiner":"groter";
		System.out.println(s);
		
		int k = i<j ? i-j : j-i;
		System.out.println(k);
		
		for (int l=0, m=10;l<m;l++) {
			System.out.println(l + " " + m);
		}
		
	}
	
}
