package oefeningen.OCA2.Obj7.Klasse;

public class Dier {
	String soort = "Dierlijk";
	String voortbewegen = "Gaan";
	
	void methodeVoortbewegen() {
		System.out.println("Het zoogdier beweegt " + voortbewegen);
	}
	
	public static void main(String[] args) {
		System.out.println("Alles van Dier");
		Dier dier = new Dier();
		System.out.println(dier.soort + " " + dier.voortbewegen);
		dier.methodeVoortbewegen();
		
		System.out.println("\nAlles van Dier-Zoogdier");
		Dier ZD = new Zoogdier();
		System.out.println(ZD.soort + " " + ZD.voortbewegen);
		ZD.methodeVoortbewegen();
		((Zoogdier)ZD).methodeVoortb();
		
		System.out.println("\nAlles van Zoogdier");
		Zoogdier zoogdier = new Zoogdier();
		System.out.println(zoogdier.soort + " " + zoogdier.voortbewegen);
		zoogdier.methodeVoortbewegen();
		zoogdier.methodeVoortb();
		
	}
	

}
class Zoogdier extends Dier{
	String soort = "Zoogdier";
	String voortbewegen = "Doorgaans vierpoten";
	void methodeVoortbewegen() {
		System.out.println("Het zoogdier beweegt " + voortbewegen);
	}
	void methodeVoortb() {
		System.out.println(this.voortbewegen);
		System.out.println(super.voortbewegen);
	}
}