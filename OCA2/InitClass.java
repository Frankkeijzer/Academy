package oefeningen.OCA2;


//What will be the result of attempting to compile and run the following code?
public class InitClass{
   public static void main(String args[ ] ){
      InitClass obj;// = new InitClass(5);
      System.out.println(i1 + "  " + i2);// + "   " + x + "  " + j + "  " + m);

   }
   int m;
   static int i1 = 5;
   static int i2 ;
   int  j = 100;
   int x;
   public InitClass(int m){
      System.out.println(i1 + "  " + i2 + "   " + x + "  " + j + "  " + m);
   }
  { j = 30; i2 = 40; }  // Instance Initializer
   static { i1++; }      // Static Initializer
}