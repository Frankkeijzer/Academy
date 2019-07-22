package oefeningen.OCA.package2;

public class GetallenWrappers {
	public static void main(String[] args) {
		int g1 =3;
		
		Integer getal = new Integer(2);
//		getal = g1;
		g1 = getal;
		Float fl1 = new Float(10.0);
		System.out.println(fl1);
		Float fl2;
		Byte By1 = new Byte ((byte)10);
		fl2 = (float)By1;
		Double D1 = new Double(12);
		Double D2 = new Double(15.0f);
		Character Ch1 = new Character('A');
		Integer getal1 = new Integer("2");
		//Integer getal2 = new Integer ("A");
		System.out.println(getal1);
	}
	
}
