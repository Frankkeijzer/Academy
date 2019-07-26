package oefeningen.OCA2.Enthuware;

//Given:
interface I { }

class Abb implements I{
    public String toString(){ return "in a"; }
}

class Bbb extends Abb{
    public String toString(){ return "in b"; }
}


public class TestClass14 {

    public static void main(String[] args) {
        Bbb b = new Bbb();
        Abb a = b;
        I i = a;
        
        System.out.println(i);
        System.out.println(a);
        System.out.println(b);
        
    }
}
//What will be printed when the above code is compiled and run?