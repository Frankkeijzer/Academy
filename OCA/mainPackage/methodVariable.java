package oefeningen.OCA.mainPackage;

import java.util.Scanner;

public class methodVariable {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int input = sc.nextInt();
		
		System.out.println(isPrime(input));
	}
	
	static boolean isPrime (int num) {
		if (num <= 1) return false;
		boolean result = true;
		for (int ctr = num-1; ctr > 1; ctr--) {
			if (num % ctr == 0 ) result = false;
		}
		return result;
	} 

}

