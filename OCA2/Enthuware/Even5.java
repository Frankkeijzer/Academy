package oefeningen.OCA2.Enthuware;

public class Even5 {
	static boolean b;
	public static void main(String[] args) {
		//		System.out.println(b);

		boolean a;
//		a = Boolean.parseBoolean("true");
		System.out.println(b);
		
		//What will the following code snippet print?
		int count = 0, sum = 0;
		do{
			if(count % 3 == 0) continue;
			System.out.println(count);
			sum+=count;
		}
		while(count++ < 11);
		System.out.println(sum);

	}
}

