package oefeningen.OCA2.Obj6;

public class MethodeArgumentenArray {
	static int[] a = new int[4];
	static int[] b = new int[6];
	
	public static void main(String[] args) {
//		behandelArray(a);
//		printenArray(a);
		behandelVarargs(a);
		printenArray(a);
	}
	
	static void behandelArray(int[] binnen){
		int i = 0;
		while(i<binnen.length) {
			a[i]=i+i;
			i++;
		}
	}
	static void behandelVarargs(int ... args) {
		
	}

	static void printenArray(int[] input) {
		for (int i =0 ; i< input.length;i++) {
			System.out.println(input[i]);
		}
	}
}
