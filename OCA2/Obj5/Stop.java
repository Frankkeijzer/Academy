package oefeningen.OCA2.Obj5;

public class Stop {
	public static void main(String[] args) {
		String[] programmers = {"Outer", "Inner"};
	for (String c: programmers) {
		for (String a : programmers) {
			for (String b : programmers) {
				if (b.equals("Inner"))
					break;
				System.out.print(b+ ":");
			}
		}
	}
	}
}
