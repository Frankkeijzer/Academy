package oefeningen.OCA.mainPackage;

public class primitivesOefenen {
	public static void main(String[] args) {
		
		byte a = 10;
		short b = 25;
		int c = 400000;
		long d = 5000;
		
		short x = a;
		int y = a;
		long z = a;
		
		byte k = (byte) b;
		int l = b;
		long m = b;
		
		byte n = (byte) c;
		short o = (short) c;
		long p = c;
		
		short q = (byte) c;
		
		System.out.println(o);
		
		
		char f = 7;
		System.out.println(f);
		
		char myChar = 'p';
		System.out.println(myChar);
		
		int i = Integer.parseInt("4590");
		System.out.println(i);
		
		int even = Integer.parseInt("1234");
		
		double gemiddelde = 20.135F;
		System.out.println(gemiddelde);
		
		byte byte1 = 100;
		byte byte2 = 100;
		byte byte3;
		
		byte3 = (byte) (byte1*byte2);
		System.out.println(byte3);
		int kl = byte1*byte2;
		
		int hexa = 0x20_B_A_75;
		System.out.println(hexa);
		
		char unicode = '\u0122';
		System.out.println(unicode);
		
		char unicode2 = 122;
		System.out.println(unicode2);

		//int hallo! = 1234;
		
		Boolean bool1 = new Boolean("TRUE");
		System.out.println(bool1);
		bool1.booleanValue();
		
		Double double4 = Double.valueOf(4.0);
		
		Integer var1 = Integer.valueOf(128);
		Integer var2 = Integer.valueOf(128);
		System.out.println(var1 == var2);
		
		Integer int5 = 5;
		Integer int6 = 6;
		int5 += int6;
		System.out.println(int5);
		
	}
}
