package oefeningen.week2;

public class overerving {
	public static void main(String[] args) {
		Fruit fruit = new Fruit();
		Banaan banaan = new Banaan();
		Fruit fruitbanaan = new Banaan();
		//links bepaalt waar je bij kunt
							// rechts bepaalt wat hij kan en doet
		
		
		Fruit fruit2 = banaan;
		//Banaan banaan2 = fruitbanaan; // kanniet: fruitbanaan heeft als referentietype Fruit
		Banaan banaan2 = (Banaan)fruitbanaan; // met casten kan het wel
		
		banaan2.kromming = 33;
		
		//Banaan banaan3 = (Banaan)fruit; // Geen compile error, wel een runtime error
		
		if (fruit instanceof Banaan) {
			System.out.println("er zit een banaan in");
			Banaan banaan3 = (Banaan)fruit;
		}
		
		
		fruit.vitaminewaarde = 35;
		banaan.vitaminewaarde = 24;
		fruitbanaan.vitaminewaarde = 55;
		// fruit.kromming = 34; // KANNIET
		banaan.kromming = 55;
		//fruitbanaan.kromming = 66; //KANNIET: fruitbanaan wordt aangesproken als Fruit, aanspreekniveau (referentietype) Fruit, object is Banaan
		fruitbanaan.voedingswaarde = 55;
		gezondEten(new Banaan());
		System.out.println("Ready");
	}
	
	static void gezondEten(Fruit stukFruit) {
		// stukFruit.kromming = 36; //KANNIET
		if (stukFruit instanceof Banaan) {
			Banaan banaan3 = (Banaan)stukFruit;
		}
	}
	
}

class Eten{
	int voedingswaarde;
}

class Fruit extends Eten{
	int vitaminewaarde;
}

class Banaan extends Fruit{
	int kromming;
}

class Zeilboot {
	
}
