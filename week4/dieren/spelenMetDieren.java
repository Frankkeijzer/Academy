package oefeningen.week4.dieren;

public class spelenMetDieren {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dier dier = new Dier();
		dier.voortbewegen();
		Dier.leeft = true;
		System.out.println(dier.leeft);
		dier.voortbewegen();
		
		Dier olifant = new Olifant();
		olifant.voortbewegen(); // override van de methode voortbewegen uit de superklasse
		((Olifant) olifant).slingerenMetDeSlurf(); // casten
		olifant.leeft = false;
		System.out.println(dier.leeft);

		
		Dier kat = new Kat();
		kat.voortbewegen();
		Kat kater = new Kat();
		kater.voortbewegen();
		kater = (Kat) (Kat) (Katachtige) (Dier) (Kat) kat; // op twee verschillende wijzen aangemaakt, 1 keer Dier en 1
															// keer Kat, dus casten
															// voorgaande is een multicast, geen probleem, wel de
															// erfrelatie in de gaten houden
		System.out.println("resultaat van multicast");
		kater.voortbewegen();

		System.out.println(kat.aantalPoten + " aantal poten");
		System.out.println(((Kat) kat).aantalPoten + " aantal poten");
		System.out.println(((Katachtige) kat).aantalPoten + " aantal poten");

		// casten is nodig omdat kat een Dier is
		System.out.println(((Kat) kat).aantalLevens);

		Katachtige poes = new Kat();
		poes.aaien();
		System.out.println();
		Katachtige siberian = new Tijger();
		siberian.aaien();

	}

}
