package week1.day2;

import java.util.Arrays;

public class LearnArrays {
	public static void main(String[] args) {
		int[] value= {16,11,19,12};
		int[] nums=new int[6];
				nums[0]= 56;
				nums[1]=89;
				nums[2]=90;
		int length = value.length;	      
		//System.out.println(length);		
		//System.out.println(value[0]);
		Arrays.sort(value);
	    for (int i =length-1; i>= 0; i--) {
	    	
	    	System.out.println(value[i]);
	    	//System.out.println(value[length-1]);
			
		}
		//System.out.println(value[length-1]);
		
	    
	}
	

}
