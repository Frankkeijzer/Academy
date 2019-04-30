package oefeningen.week2;



	import java.util.ArrayList;

	import java.util.Random;

	import java.util.Scanner;

	import java.util.Arrays;



	public class Weekopdracht2 {



		public static void main(String[] args) {

			Yahtzeespel nieuwspel = new Yahtzeespel();

			nieuwspel.start();

		}

	}



	class Yahtzeespel {

		void start() {

			System.out.println("Welkom bij het spel Yahtzee!");

			System.out.println("Met hoeveel spelers wilt u spelen? Voer een getal tussen de 1 en 4 in.");

			Scanner scannertje = new Scanner(System.in);

			String spelers = scannertje.nextLine();

			Speler speler1 = new Speler();

			Speler speler2 = new Speler();

			Speler speler3 = new Speler();

			Speler speler4 = new Speler();



			switch (spelers) {

			case "1":

				System.out.println("Je speelt alleen. Wat is je naam?");

				Scanner spel1naam1 = new Scanner(System.in);

				speler1.naam = spel1naam1.nextLine();

				spelen(speler1);

				break;

			case "2":

				System.out.println("Je speelt met 2 Spelers. Wat is naam van Speler 1?");

				Scanner spel2naam1 = new Scanner(System.in);

				speler1.naam = spel2naam1.nextLine();

				System.out.println("Wat is de naam van Speler 2?");

				Scanner spel2naam2 = new Scanner(System.in);

				speler2.naam = spel2naam2.nextLine();

				spelen(speler1);

				spelen(speler2);

				break;

			case "3":

				System.out.println("Je speelt met 3 Spelers. Wat is naam van Speler 1?");

				Scanner spel3naam1 = new Scanner(System.in);

				speler1.naam = spel3naam1.nextLine();

				System.out.println("Wat is de naam van Speler 2?");

				Scanner spel3naam2 = new Scanner(System.in);

				speler2.naam = spel3naam2.nextLine();

				System.out.println("Wat is de naam van Speler 3?");

				Scanner spel3naam3 = new Scanner(System.in);

				speler3.naam = spel3naam3.nextLine();

				spelen(speler1);

				spelen(speler2);

				spelen(speler3);

				break;

			case "4":

				System.out.println("Je speelt met 4 Spelers. Wat is naam van Speler 1?");

				Scanner spel4naam1 = new Scanner(System.in);

				speler1.naam = spel4naam1.nextLine();

				System.out.println("Wat is de naam van Speler 2?");

				Scanner spel4naam2 = new Scanner(System.in);

				speler2.naam = spel4naam2.nextLine();

				System.out.println("Wat is de naam van Speler 3?");

				Scanner spel4naam3 = new Scanner(System.in);

				speler3.naam = spel4naam3.nextLine();

				System.out.println("Wat is de naam van Speler 4?");

				Scanner spel4naam4 = new Scanner(System.in);

				speler4.naam = spel4naam4.nextLine();

				spelen(speler1);

				spelen(speler2);

				spelen(speler3);

				spelen(speler4);

			}

	System.out.println("\n" + "Het spel is voorbij... Bedankt voor het spelen!");

		}



		ArrayList<Dobbelsteen> dobbelstenen = new ArrayList<>();



		Yahtzeespel() {

			for (int z = 0; z < 5; z++) {

				dobbelstenen.add(new Dobbelsteen());

			}

		}



		

		int[] blokkeerarray = new int[] {0, 0, 0, 0, 0};

		int[] checkarray = new int [] {1, 1, 1, 1, 1};



		void spelen(Speler speler) {

			for (int getal = 0; getal < blokkeerarray.length; getal++) {

				blokkeerarray[getal] = 0;

			}

			System.out.println("\n"+ speler.naam + " is aan de beurt!");

			System.out.println("De dobbelstenen zijn gegooid:");

			boolean doorgaan = true;

			int worpnummer = 1;

			while (doorgaan) {

				if (!Arrays.equals(blokkeerarray, checkarray)) { 

				int x = 0;

				Worp worp = new Worp();

				for (Dobbelsteen dobbelsteen : dobbelstenen) {

					if (blokkeerarray[x] == 0) {

						dobbelsteen.gegooideogen = dobbelsteen.werpen();

					}

					worp.geworpen[x] = dobbelsteen.gegooideogen;

					x++;

				}

				System.out.println("Worp " + worpnummer);

				worpnummer +=1;

				worp.tonen();
				speler.worpgeschiedenis.add(worp);

				vasthouden();

				System.out.println(" ");

				System.out.println("Druk op enter als je door wilt gaan, op q om te stoppen");

				Scanner sc = new Scanner(System.in);

				String invoer = sc.nextLine();

				if (invoer.equals("q")) {

					doorgaan = false;

					break;



				}

			}

			else{

				System.out.println("Je hebt alle dobbelstenen vastgehouden.");

				break;

			}

				

			}

			System.out.println("Dit is het einde van je beurt.");

			System.out.println("Je worpgeschiedenis is:");

			for (Worp worp : speler.worpgeschiedenis) {

				System.out.println(Arrays.toString(worp.geworpen));

			}

		}

		



		void vasthouden() {

			boolean invoernodig = true;

			while (invoernodig) {

				System.out.println("Voer in welke dobbelstenen je vast wil houden");

				Scanner scanner = new Scanner(System.in);

				String vastegetallen = scanner.nextLine();

				if (vastegetallen.contains("1") || vastegetallen.contains("2") || vastegetallen.contains("3")

						|| vastegetallen.contains("4") || vastegetallen.contains("5")) {

					for (int i = 0; i < vastegetallen.length(); i++) {

						String positie = vastegetallen.substring(i, i + 1);

						Integer intpositie = Integer.parseInt(positie) - 1;

						if (blokkeerarray[intpositie] == 0) {

						blokkeerarray[intpositie] = 1;

						invoernodig = false;

						}

						else {

							System.out.println("Deze dobbelsteen of een van deze dobbelstenen heb je al vastgehouden, voer alleen nieuwe getallen in");

						}

				}

				}

				else {

					System.out.println("Je moet minstens 1 getal invullen!");

				}



			}

		}



	}



		class Dobbelsteen {

			int gegooideogen;



			int werpen() {

				Random dobbelsteen = new Random();

				int getal = dobbelsteen.nextInt(6) + 1;

				gegooideogen = getal;

				return getal;

			}



		}



		class Worp {

			int[] geworpen = new int[5];

			int[] positie = new int [] {1, 2, 3, 4, 5};



			void tonen() {

				System.out.println("Positie: " + "\t" + Arrays.toString(positie));

				System.out.println("Worp: "+ "\t" + "\t" + Arrays.toString(geworpen));

				

			}

		}



	class Speler {

		String naam;

		ArrayList<Worp> worpgeschiedenis = new ArrayList<>();

	}
