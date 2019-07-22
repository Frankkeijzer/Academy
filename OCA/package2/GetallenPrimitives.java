package oefeningen.OCA.package2;

public class GetallenPrimitives {
	public static void main(String[] args) {
		int g1 = 1;
		short s1 = 2;
		short s1g1 = (short)g1; //casten!
		byte by1 = 3;
		byte by1g1 = (byte)g1;// ook hier geldt: casten!
		long l1 =4; 
		long l1g1 = g1; // geen cast nodig een long is groter dan een int
		long l2 = l1;
		
		char c1 = 'a';
//		g1 = c1;
		System.out.println(g1);
		
		char c2 = 12;
		System.out.println(c2);
		g1 = c2;
		System.out.println(g1);
		char c3 = (char) -90;
		System.out.println("char"+ c3);
		
		int g2 = -80; // geen negatieve getallen in char zonder te casten
		char c4;
		c4 = (char) g2; //ook niet via een variabele
		byte by2 = 127;
		char c5 = (char) by2;
		short s2 = 50;
		char c6 = (char) s2;
		System.out.println("char "+c5);
		System.out.println("char "+ c6);
		
		double d1 = 10;
		System.out.println(d1); // hij maakt er bij de syso gewoon 10.0 van
		double d2 = d1; // hij maakt er onder water dus gewoon een double van
		double d1g1 = g1; //geen probleem, een int past in een double
		
		float f1 = 11; // ook geen probleem
		float f1g1 = g1; //ook geen probleem
		
		double d3 = 12.0; //uiteraard prima
		float f2 = 13.0f;	//okay, een int past in een float, geen probleem. 
							//Als je alleen er een komma getal van maakt moet je F/f achter het getal zetten
		float f3d3 = (float)d3; // dit past niet zondermeer omdat een double groter is dan een een float
		double d4 = f2; //past uiteraard.
		
		
		
		
//		int a, b, c, d;
//		int a = 10, b = 10, c = 11;
//		int a = 10, b, c;
		int a, b = 10, c =12;
		
		System.out.println( b+ c);

//		int a = 10, String b = "bla"; // DIT KAN NIET, dan moet er puntkomma tussen

		
	}
}

class EenIdee{
	//public abstract methode1() {}// dan moet de klasse abstract zijn
}

interface EenInterface{
	public abstract void methode2();
	public default void methode3() {} // je moet hem implementeren, dus curly braces
	//static void methode4();// {} // zonder body wordt de methode impliciet abstract, dit kan niet bij een static.
	static void methode5() {} //nu is er een implementatie
	
}