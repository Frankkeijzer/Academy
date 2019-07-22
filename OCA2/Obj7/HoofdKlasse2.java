package oefeningen.OCA2.Obj7;

public class HoofdKlasse2 {
	public static void main(String[] args) {
		Z z= new Z();
		Z yz = new Y();
		Y y = new Y();
		Q yq  = new Y();
		System.out.println(z.b);
		z.aa();
		System.out.println("==========YZ hieronder======================");
		System.out.println(yz.b);
		yz.aa();
		((Y)yz).qq(10);
System.out.println("------------Y hieronder------------");		
		System.out.println(y.b);
		y.aa();
		System.out.println(y.b);
		y.qq(10);
		System.out.println("++++++++++++++bb hieronder aangeroepen++++++++++++++++");
		z.bb();
		yz.bb();
		y.bb();
		System.out.println(y.c);
	}
}
 class Z{
	static int var;
	String b = "veld in Z";
	int z = 1;
//	abstract void cc(); // dan moet de class ook abstract zijn en kan de klasse niet geinstantieerd worden
	void aa() {
		System.out.println("Methode Hallo in Z");
	}
	void bb() {
		System.out.println("methode Doeg in Z");
	}
}
class Y extends Z implements Q {
	String b = "veld in Y";
	String c = "String C in Y";
	int z =5;
	void aa() {
		System.out.println("Methode Doeg in Y");
		System.out.println("Laten we ook String b printen: " + b);
	}
	void qq(int z) {
		System.out.println(z + " in Y");
	}
	
	@Override
	public void mooiemethode() {
		// TODO Auto-generated method stub
		
	}
}
interface Q{
	void mooiemethode() ;
}