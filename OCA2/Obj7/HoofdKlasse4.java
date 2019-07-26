package oefeningen.OCA2.Obj7;

public class HoofdKlasse4 {
	HoofdKlasse4(){
		System.out.println("Super");
	}
	HoofdKlasse4(int a, int b){
		System.out.println(a * b);
	}
}
class SubKlasse4 extends HoofdKlasse4{

	SubKlasse4(int a, int b) {
		System.out.println(a-b);
	}

}
