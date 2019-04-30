package oefeningen.week3.oefeningen;

public class Exceptie {
	public static void main(String[] args) {
		nieuweWerkdag maandag = new nieuweWerkdag();
		try {
			maandag.fietsen();
		} catch (Exception e) {
			System.out.println("dat wordt lopen");
		}
		
		nieuwWeekend weekend = new nieuwWeekend();
		try {
			weekend.dierentuinBezoeken();
		} catch (Exception e) {
			System.out.println("We blijven thuis");
		}
	}
}

class nieuweWerkdag{
	boolean opDeFiets = false;
	
	void fietsen() throws Exception{
		if (opDeFiets) {
			System.out.println("Ik fiets naar mijn werk");
		} else {
			throw new Exception();
		//	Exception e = new Exception(); //Exception is een class, behandel hem zo
		//	throw e; // het werpen van de exceptie buiten zijn klasse, daar moet het opgelost worden
					// hierdoor geef je de afnemer van de klasse vrijheid om te programmeren wat er moet gebeuren
		}
	}
}

class nieuwWeekend{
	boolean dierentuinOpen = false;
			
	void dierentuinBezoeken() throws Exception{
		if (dierentuinOpen) {
			System.out.println("We gaan lekker naar de dierentuin");
		} else {
			throw new Exception();
		}
	}
}