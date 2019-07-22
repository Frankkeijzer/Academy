package oefeningen.OCA2.Enthuware;


//What will be the output when the following program is run?
public class TestClass5{
    char c;
    public void m1(){
        char[ ] cA = { 'a' , 'b'};
        m2(c, cA);
        System.out.println(c);
        System.out.println( ( (int)c)  + "," + cA[1] );
    }
    public void m2(char cd, char[ ] cA){
        c = 'b';
        System.out.println(c);
        cA[1] = cA[0] = 'm';
    }
    public static void main(String args[]){
        new TestClass5().m1();
    }
}
