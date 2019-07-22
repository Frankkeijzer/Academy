package oefeningen.OCA2.Obj7;

class MySuper {// w  ww  .ja v  a  2s  . c o  m
	   int num = 100;
	   String name = "Tom";
	}

//	class MySub extends MySuper {
//	  public void print() {
//	    System.out.println("num: " + num);
//	    System.out.println("name: " + name);
//	  }
//	}

	class MySub2 extends MySuper {
	  // Hides num field in MySuper class
	   int num = 200;

	  // Hides name field in MySuper class
	   String name = "Jack";

	  public void print() {
	    System.out.println("num: " + num);
	    System.out.println("name: " + name);
	  }
	}

	public class Main {
	  public static void main(String[] args) {
//	    MySub fhSub = new MySub();
//	    fhSub.print();
		MySuper fhb2 = new MySub2();
		System.out.println(fhb2.name);
	    MySub2 fhSub2 = new MySub2();
	    fhSub2.print();
	    System.out.println(fhSub2.name);
	    System.out.println(fhSub2.num);

	  }
	}