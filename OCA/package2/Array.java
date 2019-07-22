package oefeningen.OCA.package2;

public class Array {
	public static void main(String[] args) {
		Dog dog = new Dog("Brutus", 5);
		System.out.println(dog.name);
		
		int [] intarr2 = {1,2,3,3,4,4,5};
		
		int [][] intarr3 = new int [2][10];
		
		for (int[] i : intarr3) System.out.println(i.length);
		
		intarr3 [0] = new int[4];
		intarr3 [1] = new int[25];
	
		for (int[] i : intarr3) System.out.println(i.length);
		
		//vullen
//		for (int i = 0; i<intarr3.length;i++)
//			for (int x = 0; x < intarr3[i].length;x++) intarr3[i][x] = x+i;
	
//		for(int[] i : intarr3) 
//			for (int x : i) x = 10;
		
		
//		for (int i = 0 ;i<intarr3.length;i++)
//			for (int x = 0; x<intarr3[i].length;x++)
//				System.out.println(intarr3[i][x]);
		
//		for(int[] i : intarr3) 
//			for (int x : i) System.out.println(x);
		
		
//			for(int x=0 ; x<intarr3[x].length;x++) System.out.println(x);
	
	}
}

class Dog{
	String name;
	int age;
	Dog(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
}