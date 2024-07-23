package assignments;

public class reversenum {
	 static int num=123;
	 static int result=0;
	public static void main(String[] args) {
		
		while (num>0) {
		 int i=num%10;
		 result=result*10+i;
		 num=num/10;
		 System.out.println("result = "+result);
		 
			
		 
		}
	
		
		}
	
	
}
