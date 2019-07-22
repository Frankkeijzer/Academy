package oefeningen.OCA2.Obj7;

public interface MijnInterface {
	public static final String houdbaarheidsdatum = "01-01-2020";
	int leeftijd = 21;
//	public abstract int intMethode();
	static void intMethode2() {System.out.println("Hallo");}
	void intMethode3();
}
class MijnImplementatie implements MijnInterface{
	public void intMethode3() {
		System.out.println("Hallo intMethode3");
	}
}
class MijnProbeersel{
	private  void methodeInProbeersel() {
		MijnInterface.intMethode2();
		};
}