package oefeningen.OCA2.Enthuware;


//Given the following program, which statements are true?

// Filename: TestClass.java
public class TestClass6{
	static int hallo;
   public static void main(String args[]){
     short g = 'a';
     System.out.println(g);
	  Y[] a, a1;
      Z[] b;
      a = new Y[10]; a1  = a;
      b =  new Z[20];
      a = b;  // 1
      b = (Z[]) a;  // 2
//      b = (Z[]) a1; // 3
      
      int[] arr1 = new int[3];
      int[] arr2 = new int[4];
      arr1 = arr2;
      
   }
   void methodeg() {
	   this.hallo=2;
   }
}
class Y { }
class Z extends Y { }


//Which of the changes given in options can be done (independent of each other) to let the following code compile and run without errors when its generateReport method is called?

class SomeClass{
   String s1 = "green mile";   // 0
   String local;   // 1

   public void generateReport( int n ){
      if( n > 0 ) local = "good";   //2
      System.out.println( s1+" = " + local );   //3
   }
}


