package oefeningen.OCA2.Obj6;

public class KlasseAanElkaar {
	public static void main(String[] args) {
		klasseSuper kl = new klasseSub();
		kl.methode();
//		klasseSuper kl = new klasseSuper();
//		klasseSub kl = new klasseSub();
//		klasseSub kl = (klasseSub) new klasseSuper();
	}
}
class klasseSuper{
	{
		System.out.println("Initializer block super");
	}
	public klasseSuper(){
		System.out.println("klasse super constructor");
	}
	klasseSuper(int b){
		
	}
	void methode() {
		System.out.println("methode in Super");
	}
}
class klasseSub extends klasseSuper{
	
	{
		System.out.println("Initializer block sub");
	}
	klasseSub(){
		this(10);
		System.out.println("klasse sub constructor");
	}
	klasseSub(int A){
		int getal= A;
	}
	void methode () {
		
		System.out.println("methode in sub");
		
	}
}