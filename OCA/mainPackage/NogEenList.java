package oefeningen.OCA.mainPackage;
import java.util.*;
public class NogEenList {
	public static void main(String[] args) {
		
		ArrayList lijstje = new ArrayList();// Dit mag, alleen is het niet duidelijk wat voor een lijstje het
		ArrayList <Integer> IntLijst = new ArrayList(); 
		List lijstje2 = new ArrayList();
		int[] arretje = {1,2,3,4,5};
		
		
		lijstje.add(lijstje2); // multidimensioneel ArrayList
		lijstje.add(IntLijst); // en vullen het lijstje gewoon met nog een Integer Lijstje
		lijstje.add(arretje); //en we stoppen er gewoon nog even een array in
		
		//nu even zien hoe je het benaderd
		
		for(Object lijst : lijstje) System.out.println(lijst);;
		//for (int getal : arretje) System.out.println(getal);
		
		
		ArrayList<testlijst> objectlijst = new ArrayList();
		objectlijst.add(new testlijst());
		
		for(testlijst elem: objectlijst) System.out.println(elem.getalletje);
		
		ArrayList<Integer> intlijst = new ArrayList();
		intlijst.add(1);
		//etc
		
		int[] vb2 = new int[4];
		
		testlijst[] vb = new testlijst[3];
		vb[0] = new testlijst();
		
		System.out.println(vb[0].getalletje);
		
	}
}

class testlijst{
	static int getalletje = 10;
}