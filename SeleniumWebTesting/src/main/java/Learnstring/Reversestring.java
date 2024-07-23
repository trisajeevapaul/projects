package Learnstring;

public class Reversestring {
	public static void main(String[] args) {
		String S1="Trisa";
		int length = S1.length();
		System.out.println(length);
		char[] charArray = S1.toCharArray();
		System.out.println(charArray);
		System.out.println(charArray.length);
		for (int i = charArray.length-1; i >=0; i--) {
			System.out.println(charArray[i]);
			
		}
		
	}

}
