package assignments;

public class ReverseString {
	public static void main(String[] args) {
		String name;
		name= "Trisa";
		//intializing char array according to size
        char[] str=new char[name.length()];

		for (int i = name.length()-1; i >=0; i--) {
			//The charAt() method returns the character at the specified index in a string.
			str[i]= name.charAt(i);
		    System.out.println(str[i]);
		}
		
		}
	
	}


