package oefeningen.OCA.packageKlasse.packageKlasse2;

abstract class SuperZomaar {
	abstract void hallo();
	void syso( ) {System.out.println("We zitten in superZomaar");}
	
	public static void main(String[] args) {
		SuperZomaar object1 = new even();
		System.out.println("object 1");
		object1.hallo();
		object1.syso();
		//MyIntf interfac = new MyIntf();
		
		
//		even object2 = new even();
//		System.out.println("object 2");
//		object2.hallo();
		
		even object4 = new evenKind();
		System.out.println("object 4");
		object4.syso();
		
		even object3 = new evenKind2();
		System.out.println("object 3");
		object3.hallo();
		object3.syso();		
		
//		even object5 = new SuperZomaar();
		SuperZomaar object6 = new even();
	}
}

class even extends SuperZomaar{
	void hallo() {System.out.println("hallo");}
}

class evenKind extends even{
	void syso() {System.out.println("We zitten in evenKind en hebben een override van super");}
}

class evenKind2 extends evenKind{
	void hallo() {System.out.println("Doei");}
}

interface MyIntf{}

interface MyIntf2 extends MyIntf{}