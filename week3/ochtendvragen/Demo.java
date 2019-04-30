package oefeningen.week3.ochtendvragen;

class Demo{
    public static void main(String[] args) {    
        Bij bij = new Bij();
        Bij bij2 = new Bij("zoem");
        System.out.println(bij.jib);
        System.out.println(bij2.jib);
    }
}
class Bij{
    static Bij bij; //Field van de klasse (in dit geval een object), auto initialisatie
    String jib;
    Bij(String bij){ //constructor
        jib = bij;
        System.out.println("emoz");
    }
    Bij() { //constructor
        this("moez"); //verwijzing naar een andere contstructor
    }
}
