package assignments;

import java.util.Iterator;

public class Bovas {
	public static void main(String[] args) {
		String name="jeevapaul";
		
		char[] charArray=name.toCharArray();
		 int length=name.length();
		 for (int i = 0; i < charArray.length; i++) {
			 int count=1;
			for (int j = i+1; j < charArray.length; j++) {
				if (charArray[i]==charArray[j]) {
					System.out.println(charArray[j]);
					count++;
					System.out.println(count);
				}
					
			}
		
		}
		 
		}

}
