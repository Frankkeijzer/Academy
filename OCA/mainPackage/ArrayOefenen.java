package oefeningen.OCA.mainPackage;

import java.util.ArrayList;

public class ArrayOefenen {
	public static void main(String[] args) {
		int[][] intArr;
		intArr = new int[2][4];
		
		intArr[0][0] = 1;
		intArr[0][1] = 4;
		intArr[0][2] = 7;
		intArr[0][3] = 9;
		intArr[1][0] = 10;
		intArr[1][2] = 12;
		intArr[1][3] = 15;

		//for(int i = 0; i < intArr.length; i++) for (int j = 0; j < intArr[i].length; j++) System.out.println("positie: " + i + " - " + j + ": "+ intArr[i][j]);
		
		Object[][] objArr = new Object[2][5];
		
		for (int i = 0; i < objArr.length ; i++) for (int j = 0; j<objArr[i].length;j++) objArr[i][j] = new objectKlasse();
		
//		for (int i = 0; i < objArr.length ; i++) for (int j = 0; j<objArr[i].length;j++) System.out.println(objectKlasse.naam);

		int[] tellen = new int[8];
		
		int getala = 1;
		byte getalb = 2;
		short getalc = 4;
		long getald = 7;
		char char1a = 'a';
		double getale = 1.0;
		float getalf = 5.0f;
		boolean boola = true;
		
		tellen[0] = getala;
		tellen[1] = getalb;
		tellen[2] = getalc;
		//tellen[3] = getald; // long past  niet in een int Array
		//tellen[4] = char1a;
		//tellen[5] = getale; //double past niet in een int Array
		//tellen[6] = getalf; // float past niet in een int Array
		//tellen[7] = boola; // boolean past niet in een int Array

		System.out.println(tellen[0] + tellen[1] + tellen[2] + tellen[4]);
		
		String[] namen = new String[] {"Jaap", "Piet", "Kees", "Peter"};
		for (String naam: namen) System.out.print(naam + " ");
		
		String [] voorbeeld = {"Asd", "DH"};
		
		ArrayList <Long> lang = new ArrayList();
		lang.add(10L);
		
		ArrayList<Double> dubbel = new ArrayList<>();
		dubbel.add(2.0);
		
		ArrayList<Short> short2 = new ArrayList<>();
		short2.add((short)2);
		
		ArrayList<Byte> byte2 = new ArrayList();
		byte2.add((byte)4);
		
		switch (intArr[0][0]) {
		case 1: System.out.println("\nJoepie!"); break;
		case 2: System.out.println("Boe!"); break;
		default: System.out.println("snap nie");
		}
		
		ArrayList<Integer> switchLijst = new ArrayList();
		switchLijst.add(5);
		
		switch(switchLijst.get(0)) {
		case 1: System.out.println("snap niet"); break;
		case 5: System.out.println("Jottum!"); break ;
		default: System.out.println("dag");
		}
		
		System.out.println(switchLijst);

		for (Integer i = 0; i<10 ; i++) {
			switchLijst.add(i);
		}
		
		System.out.println(switchLijst);
		for (Integer elem : switchLijst) {
			System.out.print(switchLijst.get(elem) + ", ");
			}
		System.out.println("\n"+switchLijst);

		
//		StringBuilder sbvb = new StringBuilder("weetniet");
//		sbvb.append(", maar niet heus");
//		System.out.println(sbvb);
//		sbvb.insert(4, " ");
//		System.out.println(sbvb);

		
	}
}

class objectKlasse{
	static String naam = "Klaas";
	
	Object setNaam() {
		
		return new Object();
		}
}
