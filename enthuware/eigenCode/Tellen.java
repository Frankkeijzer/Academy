package oefeningen.enthuware.eigenCode;

public class Tellen {

	public static void main(String[] args) {
		int s = 5;
  
        for(int i=0; i<3; i++){
            s = s + i;
            System.out.println("i binnen: " + i);
            System.out.println("s binnen: "+ s);
            System.out.println("verder met loop");

        }
        System.out.println();
        System.out.println("buiten: "+ s);
	}
}
