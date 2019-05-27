package oefeningen.enthuware;



//What will be the result of attempting to compile and run the following program?

public class TestClass7{
   public static void main(String args[ ] ){
      StringBuilder sb = new StringBuilder("12345678");
      sb.setLength(5);
      sb.setLength(10);
      System.out.println(sb.length());
      System.out.println(sb);
   }
}
