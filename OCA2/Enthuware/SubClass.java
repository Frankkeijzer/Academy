package oefeningen.OCA2.Enthuware;


//Which of the following lines of code that, when inserted at line 1, 
//will make the overriding method in SubClass invoke the overridden method in BaseClass on the current object with the same parameter.
class BaseClass{
   public void print(String s) {  System.out.println("BaseClass :"+s); }
}
class SubClass extends BaseClass{
   public void print(String s){
      System.out.println("SubClass :"+s);
      super.print(s);
      // Line 1
   }
   public static void main(String args[]){
      SubClass sc = new SubClass();
      sc.print("location");
   }
}
