package oefeningen.OCA2.Enthuware;


//What will be the output of compiling and running the following program:
class TestClass11 implements I1, I2{
   
	public void m1() { 
		System.out.println("Hello"); 
		}
   
   
   public static void main(String[] args){
      TestClass11 tc = new TestClass11();
//      ( (I1) tc).m1();
   tc.m1();
   System.out.println(((I2)tc).VALUE);
   }
}
interface I1{
   int VALUE = 1;
   void m1();
}
interface I2{
   int VALUE = 2;
   void m1();
}
