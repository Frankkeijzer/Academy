package oefeningen.OCA2.Obj6;

public class Dolls {
	public void nested() {
		nested(2,true);
	}
	public int nested(int level, boolean height) {
		return nested(level);
	}
	public int nested (int level) {
		return level+1;
	}
	
	public static void main(String[] args) {
//		System.out.println(new Dolls().nested());
//		System.out.println(even());
	}
	
	
	static void even() {
	}
}

