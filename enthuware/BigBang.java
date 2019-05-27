package oefeningen.enthuware;

//Given the following source code, which of the lines that are commented out may be reinserted without introducing errors?
abstract class Bang{
 //abstract void f();  //(0)
   final    void g(){}
 //final    void h(){} //(1)
   protected static int i;
   private int j;
}

final class BigBang extends Bang{
 //BigBang(int n) { m = n; } //(2)
   public static void main(String args[]){
      Bang mc = new BigBang();
   }
   void h(){}
 //void k(){ i++; } //(3)
 //void l(){ j++; } //(4)
   int m;
}
