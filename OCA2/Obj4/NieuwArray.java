package oefeningen.OCA2.Obj4;

import java.util.Arrays;

public class NieuwArray {
	public static void main(String[] args) {
		String[] nums = new String[] {"1","9","10"};
		String [] nums2 = {"a", "b"};
		String[] nums3;
		nums3 = new String[3];
		String[] nums4;
		nums4= new String[] {"a","m"};
		
		nums[0]="q";
		nums4[2]="f";
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		
		
	}
}
