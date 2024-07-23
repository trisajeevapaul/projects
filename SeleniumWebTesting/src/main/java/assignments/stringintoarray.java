package assignments;

import javax.print.DocFlavor.CHAR_ARRAY;

public class stringintoarray{
	public static void main(String[] args) {
		String name;
		name= "Trisa";
		//convert a string into array
        char[] str=name.toCharArray();
		for (int i = 0; i < name.length(); i++) {
		    System.out.println(str[i]);
		}
		
	}

}
