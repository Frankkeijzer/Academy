package oefeningen.OCA2.Obj3;

public class Woord {

	public static void main(String[] args) {
		String result = "Sunday    ".replace(' ', 'Z').trim().concat("M n");
		System.out.println(result);
		String result2 = "Sunday    ".replace(' ', 'Z').concat("M n");
		System.out.println(result2);

		String b = "Hallo ";
		System.out.println(b);
		String a = "Berend";
		b += a;
		System.out.println(b);
		
		String vr21 = "ha";
		String vr22 = "llo";
		String vr23 = "hallo";
		String vr24 = vr21.concat(vr22);
		System.out.println(vr23);
		System.out.println(vr24);
		System.out.println(vr23==vr24);
		System.out.println(vr23.equals(vr24));
		
	}

}
