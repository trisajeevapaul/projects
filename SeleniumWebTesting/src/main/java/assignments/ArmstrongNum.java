package assignments;

public class ArmstrongNum {
	public static void main(String[] args) {
		int num=153,result=0;
		int input=num;
		while (num>0) {
			 int i=num%10;
			 //3
			 	 
			result=i*i*i+result;
			//27
			int temp=num/10;
			//temp=15
			num=temp;
			//num=15
			
			System.out.println(result);
			
		}
		if(input==result) {
			System.out.println("yes armstrong num");
		}
		else {
			System.out.println("no armstrong num");
		}
	}

}
