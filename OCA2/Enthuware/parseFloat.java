package oefeningen.OCA2.Enthuware;

public class parseFloat {
	public static void main(String[] args) {
		parseFloat2("0x1");
//		Float a = 0x1;
		Float b = Float.valueOf("0x1");
		System.out.println(b);
	}

	public static float parseFloat2(String s){
		float f = 0.0f;
		try{
			f = Float.valueOf(s).floatValue();
			return f ;
		}
		catch(NumberFormatException nfe){
			System.out.println("Invalid input " + s);
			f = Float.NaN ;
			return f;
		}
		finally { System.out.println("finally");  }
	}

}
