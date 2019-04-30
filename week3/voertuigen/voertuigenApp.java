package oefeningen.week3.voertuigen;

import java.util.Scanner;

public class voertuigenApp {
	public static void main(String[] args) {
		boolean doorgaan = true;
		
		while (doorgaan) {
			System.out.println("Welkom bij de voertuigen App, voer in of je auto of een fiets hebt:");
			String invoer = schermInput().toLowerCase();
			
			
			switch (invoer) {
			case "auto":
				System.out.println("Voer het merk van je auto in: ");
				String merkAuto = schermInput();
				System.out.println("Voer ook het bouwjaar vna je auto in: ");
				String bouwjaarAuto = schermInput();
				
				break;
			case "fiets":
				System.out.println("Voer het merk van je auto in: ");
				String merkFiets = schermInput();
				break;
			default: 
				
			}
		}
	}
	
	public static String schermInput( ) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		return input;
	}
}


