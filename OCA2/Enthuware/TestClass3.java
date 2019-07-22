package oefeningen.OCA2.Enthuware;


//What will the following program print when run without any command line argument?
public class TestClass3 {
    public static void main(String[] args)  {

        boolean hasParams = (args == null ? false : true);
        System.out.println(hasParams);
        if(hasParams){
            System.out.println("has params");
        }{
            System.out.println("no params");
        }
    }
}
