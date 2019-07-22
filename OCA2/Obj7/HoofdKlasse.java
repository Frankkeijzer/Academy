package oefeningen.OCA2.Obj7;

public class HoofdKlasse {
	public static void main(String[] args) {
		Medewerker p1 = new Manager();
		Manager p2 = new Manager();
		p1.setVoornaam("Ali");
		p1.setMobiel(06123456);
		p2.setVoornaam("Klaas");
		p2.setMobiel(06321456);
		HR hr = new HR();
		hr.stuurBericht(p1);
		hr.stuurBericht(p2);
	}
}
class Medewerker{
	private int personeelsnummer;
	private String voornaam;
	private String achternaam;
	private int mobiel;
	private int privetelefoon;
	private String Afdeling;
	public int getPersoneelsnummer() {
		return personeelsnummer;
	}
	public void setPersoneelsnummer(int personeelsnummer) {
		this.personeelsnummer = personeelsnummer;
	}
	public String getVoornaam() {
		return voornaam;
	}
	public void setVoornaam(String voornaam) {
		this.voornaam = voornaam;
	}
	public String getAchternaam() {
		return achternaam;
	}
	public void setAchternaam(String achternaam) {
		this.achternaam = achternaam;
	}
	public int getMobiel() {
		return mobiel;
	}
	public void setMobiel(int mobiel) {
		this.mobiel = mobiel;
	}
	public int getPrivetelefoon() {
		return privetelefoon;
	}
	public void setPrivetelefoon(int privetelefoon) {
		this.privetelefoon = privetelefoon;
	}
	public String getAfdeling() {
		return Afdeling;
	}
	public void setAfdeling(String afdeling) {
		Afdeling = afdeling;
	}
}
class Manager extends Medewerker{
	
}
class Receptionist extends Medewerker{
	
}
class Programmeur extends Medewerker{
	
}
class HR extends Medewerker{
	void stuurBericht(Medewerker medewerker) {
		System.out.println("Stuur een bericht naar " + medewerker.getVoornaam() + " op mobiel nummer " + medewerker.getMobiel());
	}
}
