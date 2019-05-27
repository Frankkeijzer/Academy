package oefeningen.OCA.packageKlasse.packageKlasse2;

import oefeningen.OCA.packageKlasse.KlasseSuper;

public class KlasseSub2 extends KlasseSuper{
	int a = 2;
	int b= 3;
	KlasseSub2(){
		System.out.println("constructor KlasseSub2: " + a*b);
	}
	
	public static void main(String[] args) {
		//KlasseSub2 klasse2 = new KlasseSub2();
		//KlasseSub2Sub1 klassesub21 = new KlasseSub2Sub1();
		//KlasseSub2 klassesub22 = new KlasseSub2Sub1();
		KlasseSub2Sub1Sub1 var1 = new KlasseSub2Sub1Sub1();
		
	}
}
