package oefeningen.OCA2.Obj6;

public class Jump {
	private int rope = 1;
	protected boolean outside;
	public Jump() {
		this(5);
		outside =true;
	}
	public Jump(int rope) {
//		System.out.println(outside);
		this.rope = outside ? rope:rope+1;
	}
	public static void main(String[] args) {
		System.out.println(new Jump().outside);
	}
}
