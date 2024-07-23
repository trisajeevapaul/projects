package assignments;

import java.util.Arrays;

public class MaxMiniInGnArray {
	public static void main(String[] args) {
		int[] nums= {8,2,5,3,6};
		System.out.println(nums.length);
		
		Arrays.sort(nums);
		for (int i = 0; i < nums.length; i++) {
		System.out.println(nums[i]);
		}
		System.out.println(nums[0]);
		System.out.println(nums[nums.length-1]);
 
}
	
}
