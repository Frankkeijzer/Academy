package oefeningen.OCA2.Enthuware;

public class Loop {
	public static void main(String[] args) {
 
		int INT1=0;
		int INT2=3;

		for(int i=INT1; i<INT2; i++){
			System.out.println(i);
		}

		System.out.println("--------------------------------------------------");

		int i=INT1;
		do { System.out.println(i); 
		} while(i++<INT2);

	}
}
