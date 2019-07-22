package oefeningen.OCA2.Obj7;

public interface MijnInterface2 {
	
	void methodeMijnInt2();
	default void methode2MijnInt2() {System.out.println("Dit is methode 2");}
	static void methode3MijnInt2( ){System.out.println("Hallo wereld");}
	default void dezelfde() {System.out.println("Dit is dezelfde in MijnInterface2");}
}
class UitProberen implements MijnInterface2{
	public void methodeMijnInt2() {}
	
}
