package oefeningen.OCA2.Obj4;

import java.util.ArrayList;

public class ArrayInit {
	public static void main(String[] args) {
		int[] a;
		a = new int[5];
		
		int[]b;
		b = new int[] {1,2,3,4,5};
		
		int []c = {5,6,7,8};
		
		a[3] = 1;
		a[1] = 3;
		System.out.println(a);
		
		ArrayList<String> arr = new ArrayList();
		arr.add("a");
		arr.add("b");
		
		System.out.println(arr);
		
		int[][] ff = {{},{},{}};
		
//		Vehicle[] autobus = new Vehicle {new Car(),new Bus(),new airplane() };
		Vehicle[] autobus = {new Car(), new Bus()};
		System.out.println(autobus.length);
		
	}
}
class Vehicle{}
class Car extends Vehicle{}
class Bus extends Vehicle{}
class airplane extends Vehicle{}
