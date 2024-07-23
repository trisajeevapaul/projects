package assignments;

import java.util.HashSet;
import java.util.Iterator;

public class OccurenceOfCharacter {
	 static String str="Bovas";
	 static int count=0;
	public static void main(String[] args) {
		 char[] index=str.toCharArray();
		int length=str.length();
		for (int i = 0; i < length; i++) {
			if (index[i]=='o') {
				System.out.println("yes it has o");
			}
			//System.out.println(index[i]);
		}
		
		}
		
	}
	


