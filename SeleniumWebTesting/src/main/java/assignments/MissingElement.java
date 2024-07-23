package assignments;

public class MissingElement {
	static int[]data= {4,6,5,1,2};
	public static void main(String[] args) {
		int sum = 0, max = 0;
		for(int n : data){
			//the sum of all the array elements.
			sum = sum+n;
			if(n > max) { 
				System.out.println("Current max value "+max+ " Current n value "+ n +"if n > max " + (n>max));
				max = n;
				}
		}
		//Calculate the sum of the first N natural numbers as sumtotal= N*(N+1)/2.
		int sumtotal=(max*(max+1)/2);
		System.out.println("n(n+1)/2 value is "+sumtotal);
		System.out.println("Sum value is "+sum);
		System.out.println(sumtotal- sum);

	}

}
