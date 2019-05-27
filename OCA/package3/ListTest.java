package oefeningen.OCA.package3;
import java.util.* ;


//In which sequence will the characters a, b, and, c be printed by the following program?

public class ListTest{
   public static void main(String args[]){
      List s1 = new ArrayList( );
      s1.add("a");
      s1.add("b");
      s1.add(1, "c");
      System.out.println(s1);
      List s2 = new ArrayList(  s1.subList(1, 1) );
      s1.addAll(s2);
      System.out.println(s1);
      
   }
}

