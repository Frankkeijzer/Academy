package oefeningen.enthuware;


//What, if anything, is wrong with the following code?
class TestClass5{
	static int abc;
	public static void main(String[] args) {
		TestClasskl even = new TestClasskl();
		//System.out.println(even.VALUE);
		//System.out.println(((T1)even).VALUE);
		
		
		TestClass5.abc = 10;
		
		Object o = new Object();
		o.toString();
	}
}


//Filename: TestClass.java
class TestClasskl implements T1, T2{
   public void m1(){}
}
interface T1{
   int VALUE = 1;
   void m1();
}
interface T2{
   int VALUE = 2;
   void m1();
}

