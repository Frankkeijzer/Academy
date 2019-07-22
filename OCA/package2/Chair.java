package oefeningen.OCA.package2;

interface Jumpable{
	int height = 1;
	default void worldRecord() {
		System.out.println(height);
	}
}


interface Moveable{
	int height = 2;
	static void worldRecord() {
		System.out.println(height);
	}
}

public class Chair implements Jumpable, Moveable{
	int height = 3;
	Chair(){
		worldRecord();
	}
	public static void main(String[] args) {
		Jumpable j = new Chair();
		Moveable m = new Chair();
		Chair c = new Chair();
	}
}

