package oefeningen.OCA2.Enthuware;


//Which line(s) of code in the following program will cause a compilation error?
public class TestClass12{
   static int value = 0; //1
   public static void main(String args[]) //2
   {
      int ndArgument = Integer.parseInt(args[2]); //3
      if( true) //4  
      {
         value = -10;
      }
      else{
         value =  ndArgument;
      }
      for( ; value>0; value--) System.out.println("A"); //5
   }
}
