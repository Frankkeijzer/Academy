package oefeningen.enthuware;


//What will be the result of attempting to compile and run the following program?
class TestClass8{
	public static void main(String args[]){
		int i = 0;
		for (i=1 ;  i<5  ; i++) { continue;}  //(1)
		for (i=2 ;       ; i++) {break;}       //(2)
		for (    ; i<5?false:true ;    ) {;}     //(3)
		System.out.println(i);
		
	}
}
