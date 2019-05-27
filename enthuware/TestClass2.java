

//in file TestClass.java
package oefeningen.enthuware;
//import p1.Movable;
//import p2.Donkey;
public class TestClass2 {
    public static void main(String[] args) {
        Donkey m = new Donkey();
        m.move(10);
        m.moveBack(20);
        System.out.println(m.location);
    }
}
