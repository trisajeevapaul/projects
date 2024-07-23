package assignments;

public class SumOfDigits {
	public static void main(String[] args) {
		int num=897;
		int result=0;
		while(num>0) {
			//
			int temp=num%10;
			//3
			result=temp+result;
			System.out.println(result);
			num=num/10;
		}
		}
	}


