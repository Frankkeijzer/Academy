package oefeningen.OCA2.Enthuware;

//What will happen on running the following program?

public class DatabaseWrapper
{
  static String url = "jdbc://derby://localhost:1527//mydb";
  
  static DatabaseWrapper getDatabase()
  {
     System.out.println("Getting DB");
     return null;
  }
  
  
  
  public static void main(String[ ] args)
  {
    System.out.println( getDatabase().url );
    System.out.println();
    System.out.println(getDatabase() + " : ");
    System.out.println();
//    System.out.println(DatabaseWrapper.url);
//    System.out.println(url);
  }
}
