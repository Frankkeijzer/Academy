package oefeningen.OCA2.Enthuware;


//What will be the result of compiling and running the following program ?

class NewException extends Exception {}
class AnotherException extends Exception {}
public class ExceptionTest{
   public static void main(String [] args) throws Exception{
      try{
         m2();
      }
      finally { System.out.println("Hallo");}
//      finally{ m3(); }
    }

    public static void m2() throws NewException{  throw new NewException();  }
    public static void m3() throws AnotherException{  throw new AnotherException();  }
}

