package oefeningen.enthuware;


//Which of the changes given in options can be done (independent of each other) to let the following code compile and run without errors when its generateReport method is called?

class SomeClass2{
   String s1 = "green mile";   // 0
   public void generateReport( int n ){
      String local;   // 1
      if( n > 0 ) local = "good";   //2
      //System.out.println( s1+" = " + local );   //3
   }
}
