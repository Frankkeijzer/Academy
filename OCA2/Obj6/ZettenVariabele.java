package oefeningen.OCA2.Obj6;

public class ZettenVariabele {
		
	public static void main(String[] args) {
		Zetten a = new Zetten();
		a.printen();
		a.hallo(5);
		a.printen();
//		int b = a.hallo(3);
	}
}

class Zetten{
	 int classevar = 0;
		
	 void hallo (int a) {
		classevar = a;
	}
	
	void printen() {
		System.out.println(classevar);
	}

}
