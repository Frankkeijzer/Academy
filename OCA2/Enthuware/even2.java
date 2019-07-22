package oefeningen.OCA2.Enthuware;

public class even2 {
	public static void main(String[] args) {
		short s = 9;
		Short k = new Short((short) 9);
		System.out.println(k instanceof Short);
		System.out.println(true?methode1():methode2());
		System.out.println(args.length);
//		System.out.println(args[0]);
		String a = new String("Hallo");
		a = null;
		String b = new String("null");
	}
	static int methode1 () {
		return 1;
	}
	static int methode2() {
		return 2;
	}
}

