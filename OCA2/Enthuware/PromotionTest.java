package oefeningen.OCA2.Enthuware;


//What will be the result of attempting to compile and run the following code?
public class PromotionTest{
   public static void main(String args[]){
      int i = 5;
      float f = 5.5f;
      double d = 3.8;
      char c = 'a';
      if (i == f) c++;
      System.out.println(( (f + d)));
      System.out.println((int) f + (int) d);
      if (((int) (f + d)) == ((int) f + (int) d))
    	  c += 2;

      
      
      System.out.println(c);
      
      
   }
}

