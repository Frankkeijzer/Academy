package oefeningen.OCA2.Obj6;

public class PriveVelden {
	public static void main(String[] args) {
		persoon a = new persoon();
//		a.lengte = 19;
		
	}
}
class persoon{
	private int lengte;
	private String voornaam;
	private String achternaam;
	public int getLengte() {
		return lengte;
	}
	public void setLengte(int lengte) {
		this.lengte = lengte;
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
	
	
}
