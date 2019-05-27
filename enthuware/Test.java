package oefeningen.enthuware;


//What will the following class print when executed?

class Test{
    static boolean a;
    static boolean b;
    static boolean c;
    public static void main (String[] args){
        boolean bool = (a = true) || (b = true) && (c = true);
        System.out.println(a + ", " + b + ", " + c);
        System.out.println(bool);
    }
}
