package Learnstring;

import java.util.Iterator;

public class String {
	public static void main(String[] args) {
		String S1="Trisa Jeevapaul";
		String S2="trisa Jeevapaul";
		System.out.println(S1.equals(S2));
		System.out.println(S1.equalsIgnoreCase(S2));
		int length = S1.length();
		System.out.println(length);
        char[] charArray = S1.toCharArray();
        System.out.println(charArray);
        for (int i = 0; i <=charArray.length-1; i++) {
			System.out.println(charArray[i]);
        }
       // 1-16 of over 100,000 results
        String S3="1-16 of over 100,000 results";
       // String substring = S3.substring(90);
        //System.out.println(substring);
        //S3.substring(90,indexof);
          char charAt = S1.charAt(2);	
          System.out.println(charAt);
          boolean contains = S1.contains("Trisa");
			if (contains) {
				System.out.println("yes");
				
			} else {
				System.out.println("no");

			}
			
		}

	}



