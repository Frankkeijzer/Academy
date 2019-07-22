package oefeningen.OCA2.Obj3;

public class Switch {
	int getal;
	
	public static void main(String[] args) {
		switch(reken(2)) {
		case 2:System.out.println("waarde is 2");
				break;
		case 4: System.out.println("waarde is 4");
				break;
		case 6:System.out.println("waarde is 6");
				break;
		default:System.out.println("geen waarde");
		}
		
		
		switch(10) {
			case 10: System.out.println("hallo");
		}
		
		Switch a = new Switch();
		a.getal =1;
		switch (a.getal) {}
		
		
	}
	static int reken(int waarde) {
		return 1*waarde;
	}
}
