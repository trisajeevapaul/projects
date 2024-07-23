package assignments;

public class SmallestnNumArray {
	static int temp;
	public static void main(String[] args) {
		//intialize the array
		int[] num= {16,11,19,12};
		for (int i = 0; i < num.length; i++) {
			for (int j = num.length-1; j >=0; j--) {
				if (num[i]>num[j]) {
                    temp=num[j];
                    
				}
				
				
			}
		}
		System.out.println(temp);	        
	}
	

}
