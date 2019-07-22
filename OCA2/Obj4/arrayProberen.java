package oefeningen.OCA2.Obj4;

public class arrayProberen{

	public static void main(String[] args) {
		int[] a = new int[1];
		
		int b[] = new int[8];
		
		int[] c= new int[]{9,0,7};
		
		
		String [] strArray = new String[Math.max(2,3)];
		
		
		int[] intArray = {0,1,2,3,4};
		intArray[4] = 0;
		System.out.println(intArray.length);
		
		System.out.println(intArray[4]);
		
		intArray = null;

		intArray = new int[10];
		
//		System.out.println(intArray[0]);
		System.out.println(intArray.length);
//		System.out.println(intArray[0]);
		
		
	}

}
