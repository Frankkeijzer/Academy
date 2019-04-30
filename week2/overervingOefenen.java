package oefeningen.week2;

import java.util.Scanner;

public class overervingOefenen {
	public static void main(String[] args) {
		Kunstwerken kw = new Kunstwerken();
		Kunstwerken brug = new Brug();
		kw.xyCoords = "12;14";
		brug.xyCoords = "18;30";
		kw.onderhoud();
		System.out.println(kw.xyCoords);
		
		//Input van toetsenbord
		//Scanner sc = new Scanner(System.in);
		//String input = sc.nextLine();
		
		//String input = input.nextLine(new Scanner(System.in));
		
		
		Brug nieuwBrug = new Brug();
		nieuwBrug.bewegen(8);
		
		Sluis sluis = new Sluis();
		sluis.grootte = 3;
		
		Slopen().onderhoud();
		
	}
	
	static Kunstwerken Slopen() {
		System.out.println("Gesloopt.");
		return new Kunstwerken();
	}
	
}

class Kunstwerken {
	String xyCoords;
	void onderhoud() {
		System.out.println("Alle kunstwerken hebben onderhoud nodig");
	}
}

class Brug extends Kunstwerken{
	String naam;
	void bewegen(int breedte) {
		if (breedte > 10) {
			System.out.println("De brug gaat open");
		} else {
			System.out.println("Uw boot is te breed, u kunt er niet door.");
		}
	}
}

class Sluis extends Kunstwerken {
	int grootte;
	void schipDoorlaten(String bootNaam) {
		System.out.println(bootNaam + " boot ligt in de sluis");
	}
}

class Schilderij {
	int oppervlakte;
	void schilderen() {
		System.out.println("Het schilderij is geschilderd door Van Gogh");
	}
}