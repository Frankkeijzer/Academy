package oefeningen.enthuware;


//What will be the result of attempting to compile and run the following program?

public class TestClass6{
   public static void main(String args[]){
      int x  = 0;
      labelA:   for (int i=10; i<0; i--){
         int j = 0;
         labelB:
         while (j < 10){
            if (j > i) break labelB;
            if (i == j){
               x++;
               System.out.println("x++ " + x);
               continue labelA;
            }
            System.out.println("j++ "+ j);
            j++;
         }
         System.out.println("x-- "+x);
         x--;
      }
      System.out.println(x);
   }
}