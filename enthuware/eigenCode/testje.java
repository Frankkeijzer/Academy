package oefeningen.enthuware.eigenCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class testje {
	
	 
	public static void main(String[] args) {
		int a = 5;
		int[] array = new int[2];
		int [] array2 = {2,3,4,5};
		System.out.println(array2);
		
		List lijst = new ArrayList();
		
	}
}

class super1{
	Object methode(){
		return new Object();
	}
}

class sub extends super1 implements A, B{
	String methode(){
		return new String();
	}
}

class super2{}

interface A{}

interface B{}