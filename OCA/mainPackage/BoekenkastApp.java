package oefeningen.OCA.mainPackage;

import java.util.ArrayList;
import java.util.Scanner;

public class BoekenkastApp {
	public static void main(String[] args) {
		
		boolean doorgaan = true;
		String schermKeuze;
		schermOutputWelkom();
		Boekenkast kinderboeken = new Boekenkast();
		while (doorgaan) {
			System.out.println();
			String schermInput = Input().toLowerCase();
			switch (schermInput) {
			case "b":
				System.out.println("Wat is de titel van het boek: ");
				String titel = Input();
				System.out.println("Wat is de naam van de auteur: ");
				String auteur = Input();
				System.out.println("Wat is het ISBN: ");
				String isbn = Input();
				Boek boek = new Boek(titel, auteur, isbn);
				kinderboeken.vullenBoekenkast(boek);
				break;
			case "k":
				kinderboeken.watZitErInDeKast();
				break;
			case "q": doorgaan = false;
				break;
			default:
				System.out.println("Je hebt een verkeerde letter ingetoetst, probeer het nog eens:");
				System.out.println("Toets \\\"b\\\" voor het opgeven van een boek, of \\\"k\\\" om te zien welke boeken er zijn, of \\\"q\\\" om te stoppen.");
				break;
			}
		}
	}
	
	static void schermInputBoek() {
		//Nog niet ingebruik
	}
	
	static void schermOutputWelkom() {
		System.out.println("Welkom bij de bibliotheek.");
		System.out.println("Toest \"b\" voor het ingeven van een nieuw boek,");
		System.out.println("Toest \"k\" voor het raadplegen van de inhoud van de bibliotheek,");
		System.out.println("Toest \"q\" om het programma te stoppen.");
	}
	
	static String Input(){
	Scanner sc = new Scanner(System.in);
	String Input = sc.nextLine();
	return Input;
	}
}

class Boek{
	String titel;
	String auteur;
	String ISBN;
	
	Boek(String titelIn, String auteurIn, String ISBNin) {
		titel = titelIn;
		auteur = auteurIn;
		ISBN = ISBNin;
	}
}

class Boekenkast{
	static ArrayList<Boek> boekenKast = new ArrayList<>();
	static void vullenBoekenkast(Boek boek) {
		boekenKast.add(boek);
		System.out.println("\nToets \"b\" voor nog een boek, of \"k\" om te zien welke boeken er zijn of \"q\" om te stoppen.");
	}
	
	void watZitErInDeKast() {
		for (Boek boek:boekenKast) {
			System.out.println(boek.auteur + " " + boek.titel);
		}
		System.out.println("\nToets \"b\" voor het opgeven van een boek of \"q\" om te stoppen.");
	}
}