package oefeningen.week3.oefeningen;

public class Demo {

	public static void main(String[] args) {
		Leraar piet = new Leraar();
		piet.lesgeven();

	}

}


class Leraar{
	int aantalLeerlingen = 5;
	void lesgeven() {
		if(aantalLeerlingen > 0) {
			System.out.println("Ik ben aan het lesgeven");
		} else {
			//System.out.println("Er zijn te weinig leerlingen");
			try {
				throw new Exception();
			} catch (Exception e) {
				System.out.println("Er zijn te weinig leelingen");
			}
			
			// drie categorien:
				// checked exception
					//bemoeienis compiler
				// runtime exception (unchecked error)
					//geen bemoeienis compiler
			// error
				//andere stamboom, geen bemoeienis compiler
		}
		
	}
}