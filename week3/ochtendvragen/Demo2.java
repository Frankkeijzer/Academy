package oefeningen.week3.ochtendvragen;


class Demo2{
    static int b = hoi();
    public static void main (String[] args){
        Beveiliger piet = new Beveiliger();
        if(piet.pas.geblokkeerd) {
            System.out.println("a");
        }
    }
    static int hoi() {
        System.out.println("b");
        return 3;
    }
}

class Pasje{
    boolean geblokkeerd; //field van klasse Pasje
    Pasje(){
        System.out.println("c");
    }
}
class Beveiliger{
    Pasje pas = new Pasje();
}
