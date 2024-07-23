package learnException;

public class Learntry {
	public static void main(String[] args) {
		int a=10;
		int b=0;
		int []nums= {5,10,60};
		try {
			//try used to enclose the code which throws exception
			System.out.println(a%b);
			//used to handle exception which caught by try and provide information about the exception
		    
		}
		
		catch (Exception e) {
			System.out.println(e);
			
		}
		try {
			System.out.println(nums[3]);
		} catch (Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("stop the program");
			
		}
		
	
		}

}
