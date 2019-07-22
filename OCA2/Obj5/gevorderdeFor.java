package oefeningen.OCA2.Obj5;

public class gevorderdeFor {
	public static void main(String[] args) {
		StringBuilder myArr[] = {
			new StringBuilder ("Java"),
			new StringBuilder ("Oracle")
		};
		for (StringBuilder val : myArr) System.out.println(val);
		for (StringBuilder val : myArr) val.append("Oracle");
		for (StringBuilder val : myArr) System.out.println(val);
		
		for (StringBuilder val : myArr) System.out.println(val);
		for (StringBuilder val : myArr) val = new StringBuilder("Oracle");
		for (StringBuilder val : myArr) System.out.println(val);
		
		
	}
}
