package oefeningen.OCA2.Obj7;

interface Interviewer{
	public final static int MIN_SAL = 9999;
	public default void submitInterviewStatus() {
		System.out.println(this);
		System.out.println(this.MIN_SAL);
		System.out.println(this.print());
	}
	public abstract String print();
}

class Manager5 implements Interviewer{
	public String print() {
		System.out.println(this);
		return ("I'm  " + this);
	}
}

public class Foo {
	public static void main(String[] args) {
		Manager5 m = new Manager5();
		m.print();
		Interviewer m2 = new Manager5();
		m2.submitInterviewStatus();
	}

}
