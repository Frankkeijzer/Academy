package oefeningen.week2;

class overerving2 {
	private void psvm() {
		Spiegelaar piet = new Spiegelaar();
		Medewerker joost = new Spiegelaar();
		piet.salarisOntvangen();
		piet.spiegelen();
		Medewerker hans = piet;
		Medewerker joris = (Spiegelaar)piet;
		aannemen(piet);
		//piet = new Cassiere(); //KANNIET
		joost = new Cassiere(); 
		//joost.spiegelen(); //KANNIET
		
		Cassiere jannie = new Cassiere();
		aannemen(jannie);
		
		aannemen(new Cassiere());

		
	}
	static void aannemen(Medewerker medewerker) {
		
	}
}

class Medewerker{
	int leeftijd;
	void salarisOntvangen() {
		System.out.println("Jippie ik heb salaris");
	}
}

class Spiegelaar extends Medewerker{
	void spiegelen() {
		System.out.println("Ik ben aan het spiegelen en " + leeftijd + "jaar oud");
	}
}

class Cassiere extends Medewerker{
	void afrekenen() {
		System.out.println("Ik ben aan het afrekenen");
	}
}