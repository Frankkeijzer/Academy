package oefeningen.week4.dieren;

public class Dier {
	int aantalPoten = 10;
	static boolean leeft;
	public void voortbewegen() {
		System.out.println("Een dier kan lopen");
		this.leeft = true;
		if (this.leeft == true) System.out.println("Het dier loopt");
		else System.out.println("Het dier ligt");
	}
}
