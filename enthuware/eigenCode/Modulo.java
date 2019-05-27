package oefeningen.enthuware.eigenCode;

public class Modulo {
	public static void main(String[] args) {
		

//What will the following code snippet print?
int count = 0, sum = 0;
do{
       if(count % 3 == 0) continue;
       System.out.println("count: " + count);
       sum+=count;
}
while(count++ < 11);
System.out.println("Sum: "+ sum);
		
		
		
//		for (int i = 0;i<11;i++) {
//			int j = i % 3;
//			System.out.println(j);
//		}
	}
}
