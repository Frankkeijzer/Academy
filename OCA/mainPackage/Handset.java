package oefeningen.OCA.mainPackage;

public class Handset {

	public static void main(String[] args) {
		double price;
		String model;
		//Keys varKeys = (region, keys) -> {if(keys >= 32) return region; else return "default";};
		Keys varKeys1 = (x, keys) -> methode(x, keys);
		System.out.println(varKeys1.keypad("ASD", 20));
		
	}
	static String methode(String region, int keys){
		if(keys >= 32) 
			return region; 
		else 
			return "Default";
	}
}

interface Keys{
	abstract String keypad (String region, int keys);
}

// even nieuwe klasse en interface om te zien hoe het met static zit, alleen maar nodig omdat ik vanuit een statische methode de methode aanroep
interface TestInterface{
	abstract String keypad (String region, int keys);
}

class NieuweKlasse{
	String methode2(String A, int B){
		if(B >= 32) 
			return A; 
		else 
			return "default";
	}
	
	TestInterface var1 = (region, keys) -> methode2(region, keys);
	
}