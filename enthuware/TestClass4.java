package oefeningen.enthuware;


//Consider the following code:
class Super { static String ID = "QBANK"; }

class Sub extends Super{
   static { System.out.print("In Sub"); }
}
public class TestClass4{
   public static void main(String[] args){
      System.out.println(Sub.ID);
      new Sub();
      Sub a = new Sub();
      System.out.println(a.ID);
      
      
      int z;
      z=10;
      if (z<0);
   }
}
//What will be the output when class Test is run?
