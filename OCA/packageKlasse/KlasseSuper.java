package oefeningen.OCA.packageKlasse;

public class KlasseSuper {
	public String varString1 = "Publiek Hallo";
	protected String varString2 = "Protected Hallo";
	String varString3 = "Package Default Hallo";
	private String varString4 = "Private Hallo";
	
	final public String varString11= "Final Publiek Hallo";
	final protected String varString12 = "Final Protected Hallo";
	String varString13 = "Final Package Default Hallo";
	private String varString14 = "Final Private Hallo";

	public static String varString21 = "Static Publiek Hallo";
	protected static String varString22 = "Static Protected Hallo";
	static String varString23 = "Static Package Default Hallo";
	private static String varString24 = "Static Private Hallo";
	
	public static final String varString31 = "Final Static Publiek Hallo";
	protected static final String varString32 = "Final Static Protected Hallo";
	static final String varString33 = "Final Static Package Default Hallo";
	private static final String varString34 = "Final Static Private Hallo";
	//Einde fields
	
	
	//De Methodes
	public void methode1() {System.out.println("Public methode");}
	protected void methode2() {System.out.println("Protected methode");}
	void methode3() {System.out.println("Package Default methode");}
	private void methode4() {System.out.println("Private methode");}

	//public abstract void methode11(); // abstract methode heeft geen body EN mag alleen in een abstracte klasse voorkomen.
	
	public final void methode21() {System.out.println("Final Public methode");}
	protected final void methode22() {System.out.println("Final Protected methode");}
	final void methode23() {System.out.println("Final Package Default methode");}
	
	public static void methode31() {System.out.println("Static Public methode");}
	protected static void methode32() {System.out.println("Static Protected methode");}
	static void methode33() {System.out.println("Static Package Default methode");}
	static private void methode34() {System.out.println("Static Private methode");}		
	
	public static final void methode41() {System.out.println("Static Final Public methode");}
	protected static final void methode42() {System.out.println("Static Final Protected methode");}
	static final void methode43() {System.out.println("Static Final Package Default methode");}
	static private final void methode44() {System.out.println("Static Final Private methode");}	

	
	
}
