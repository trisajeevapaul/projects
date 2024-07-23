package assignments;

import java.util.Iterator;

public class PrintDuplicate {
	static int j;
 public static void main(String[] args) {
	String name="Happy";
	char[] str=name.toCharArray();
	for (int i = 0; i < name.length(); i++) {
				for (int j=i+1; j <name.length(); j++) {
		if (str[i]==str[j]) {
			
			System.out.println(str[j]);
			
		}
	
		}
		
	}
	
	
}
}
