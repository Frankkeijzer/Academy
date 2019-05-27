package oefeningen.enthuware;


//Given the following code, which of the constructors shown in the options can be added to class B without causing a compilation to fail?
class A{
   int i;
   public A(int x) { this.i = x; }
}

class B extends A{
   int j;
 //  B(){}
  // public B(int y ) { j = y; }
   public B(int x, int y) { super(x);  this.j = y; }
}