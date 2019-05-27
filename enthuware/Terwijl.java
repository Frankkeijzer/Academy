package oefeningen.enthuware;

public class Terwijl {

//Consider the following code for the main() method:
public static void main(String[] args) throws Exception{
   int i = 1, j = 10;
   do {
//      if (i++ > --j) continue;
//	  i++;
//	  --j;
	   
	  ++i;
	  j--;
	  
	   System.out.println("i: " + i + "j: " + j);

   } while (i < 5);
   System.out.println("i=" + i + " j=" + j);
}
//What will be the output when the above code is executed?
}

interface effies{
	public abstract void hallo();
}