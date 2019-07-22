package oefeningen.enthuware;


//What would be the result of compiling and running the following program?

class SomeClass{
   public static void main(String args[]){
      int size = 10;
      int[] arr = new int[size];
//      System.out.println(size);
//      System.out.println(arr.length);
      for (int i = 0 ; i < size ; ++i) System.out.println(arr[i]);
   }
}
