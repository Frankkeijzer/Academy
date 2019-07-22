package oefeningen.OCA2.Obj7;

public interface MijnInterface3 {
	default void methodeMijnInt3() {}
	int methodeUitrekenen();
	default void dezelfde() {System.out.println("Dit is dezelfde in MijnInterface2");}
}
class bererekenen implements MijnInterface3{
	public int methodeUitrekenen() {
		return 1;
	}
	int methodeUitrekenen(int a) {
		return a*1;
	}
}