package assignments;

import java.lang.reflect.Array;
import java.util.Arrays;

public class smallestNum {
public static void main(String[] args) {
	int[] small= {5,8,1,3,4};
	int n=small.length;
	//arrange in assending order
	Arrays.sort(small);
	for (int i = 0; i < small.length; i++) {
		System.out.println(small[i]);
	}
	System.out.println("second smallest"+small[1]);
	
}
}
