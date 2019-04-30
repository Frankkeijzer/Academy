package oefeningen.week3.ochtendvragen;

class Demo3{
    public static void main(String[] args) {
        Daarom d = new Daarom();
       // Daarom e = new Waarom();
       // e.draaien(3);
       // System.out.println(e.o);
    }
}
class Daarom{
    static int o = 14;
    int draaien(int a) {
        o = 6;
        System.out.println(a);
        return a;
    }
}
/*
class Waarom extends Daarom{
    int b;
    void draaien(int a) { //child Waarom kent eenzelfde methode (overriding), echter gaat het mis omdat er verschillende return typen zijn. Dus compile fout
        b = 9;
    }
}
*/