package oefeningen.week3.voertuigen;

public class Auto extends Voertuigen{
	String bouwjaar;

	@Override
	void maakGeluid() {
		System.out.println("Broembroem");
		
	}

	@Override
	void toonJezelf() {
		System.out.println("Ik ben een auto en mijn merk is: ");
		
	}
	
}
