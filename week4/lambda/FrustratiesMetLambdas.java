package oefeningen.week4.lambda;

public class FrustratiesMetLambdas {
	public static void main(String[] args) {
		
		MijnEigenInterface vermenigvuldigMetTwee = (int a) -> System.out.println(a + " * 2 = " + (a*2));
		//of 
		//MijnEigenInterface vermenigvuldigMetTwee = a -> System.out.println(a + " * 2 = " + (a*2));

		
		
//		MijnEigenInterface vermenigvuldigMetTwee = new MijnEigenInterface() {
//			public void verwerk(int a) {
//				System.out.println(a + " * 2 = " + (a*2));
//			}
//		};
//		Voorgaande is hetzelfde als de bovenste lambda
		
		
		MijnEigenInterface delenDoorVijf = new MijnEigenInterface() {
			public void verwerk(int a) {
				System.out.println(a + " / 5 = " + ( a/ 25));
			}
		};
		
		bereken(5, vermenigvuldigMetTwee);
		bereken(20, delenDoorVijf);

		bereken(100, vermenigvuldigMetTwee);
		bereken(100, (int a) -> System.out.println(a + " * 2 = " + (a*2)));
		
		
//		vermenigvuldigMetTwee.verwerk(5);
//		delenDoorVijf.verwerk(20);
//		delenDoorVijf.verwerk(25);

	}
	
	static void bereken (int a, MijnEigenInterface mijnEigenInterface) {
		System.out.println("Methode voert berekening uit, maar weet van te voren niet hoe er gerekend wordt.");
		mijnEigenInterface.verwerk(a);
	}
	
	
}
