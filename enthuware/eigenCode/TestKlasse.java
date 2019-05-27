package oefeningen.enthuware.eigenCode;

public class TestKlasse {
	static TestKlasse test1;
	static Integer integergetal;
	int a = 5;
	//Testklasse test2;
	
	public static void main(String[] args) {
		//TestKlasse test = new TestKlasse();
		test1 = new TestKlasse();
		integergetal = new Integer(2);
		
		//nieuweKlasse2.var5;
		//nieuweKlasse2.methode5();
		
		nieuweKlasse3.methode10();
	}
	void even() {
		System.out.println("Niets");
//		System.out.println(test2.a);
	}
}

class nieuweKlasse{
	nieuweKlasse var1;
	
	void methode() {
		var1 = new nieuweKlasse();
	}
}

class nieuweKlasse2{
	static nieuweKlasse2 var5;
	
	void methode5() {
		var5 = new nieuweKlasse2();
	}
}

class nieuweKlasse3{
	static nieuweKlasse3 var10;
	
	static void methode10() {
		var10 = new nieuweKlasse3();
	}
	static {}
}

