package oefeningen.week4.dieren;

public class Kat extends Katachtige {
	public int aantalPoten = 4;
	public int aantalLevens = 9;

	public void voortbewegen() {//(int a ) { // geen override aangezien de signature anders is
		System.out.println("Sluipt als een kat");
	}

	@Override
	public void aaien() {
		// TODO Auto-generated method stub
		System.out.println("De kat wordt geaaid.");
	}
	
}
