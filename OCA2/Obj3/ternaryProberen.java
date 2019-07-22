package oefeningen.OCA2.Obj3;

public class ternaryProberen {

	public static void main(String[] args) {
		int bill = 2000;
		int discount = bill>2000?15:10;
		System.out.println(discount);

		discount = bill> 200? bill-10:bill-20;
		System.out.println(discount);
	
		discount = bill < 1000?new Integer(10): new Integer (30);
	
		
		bill = 2200;
		int qty = 10;
		int days = 1;
		discount = bill > 1000 ? 
				qty > 11 ? 
						10 : 
						days > 9 ? 20 : 30 : 
				5;
		System.out.println(discount);
	}
}
