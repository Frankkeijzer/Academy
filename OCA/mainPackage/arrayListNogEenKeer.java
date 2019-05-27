package oefeningen.OCA.mainPackage;

import java.util.ArrayList;
import java.util.List;

public class arrayListNogEenKeer {
	public static void main(String[] args) {
		ArrayList<String> strLijst = new ArrayList<>();
		strLijst.add("een");
		strLijst.add("twee");
		strLijst.add("drie");
		List s2 = new ArrayList(strLijst.subList(1, 2) );
		System.out.println(s2);
		
		ArrayList<String> seasons = new ArrayList();
		seasons.add(0, "herfst");
		System.out.println(seasons);
		
	}
}
