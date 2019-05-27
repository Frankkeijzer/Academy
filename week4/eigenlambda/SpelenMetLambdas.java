package oefeningen.week4.eigenlambda;

public class SpelenMetLambdas {
	public static void main(String[] args) {

//		lambdaInterface naam = new  lambdaInterface() {
//			@Override
//			public void consume(int a, int b) {
//				// TODO Auto-generated method stub
//				System.out.println(a + " + " + b + " = "+ (a+b));
//
//			}
//		};
		
		
		lambdaInterface optellen = (int a, int b) -> System.out.println(a + " + " + b + " = "+ (a + b));
		lambdaInterface vermenigvuldigen = (int a, int b) -> System.out.println(a + " * " + b + " = "+ (a * b));

		
		optellen.consume(10,14);
		vermenigvuldigen.consume(10,14);

		
	}
}
