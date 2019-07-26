package oefeningen.OCA2.Enthuware;


//Consider the following code:
class Aa{
   Aa() {  
	   print();
	   }
   
   void print() { 
	   System.out.println("A"); 
	   }
}
class B extends Aa{
   int i =   4;
   public static void main(String[] args){
      Aa a = new B();
      a.print();
   }
   void print() { 
	   System.out.println(i); 
	   }
}
//What will be the output when class B is run ?