package oefeningen.OCA2.Obj5;

public class DoeZolang {
	public static void main(String[] args) {
		int a = 0;
		do System.out.println(a++);
		while (a<0);
	
		System.out.println(a);
		
		while (a<1) System.out.println("hallo");
		
		
		int num = 9;
		boolean divisibleBy7 = false;
		do {
			System.out.println(num);
			if (num % 7 == 0) divisibleBy7 = true;
			num--;
		} while (divisibleBy7 == false);
		
	}
}
