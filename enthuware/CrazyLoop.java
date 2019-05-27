package oefeningen.enthuware;
//What will the following code print?

public class CrazyLoop {
	public static void main(String[] args) {
		int c = 0;
		JACK: while (c < 8){
			JILL: System.out.println(c);
			if (c > 3) ;//break JILL; 
			else c++;
		}
	}
	
}
