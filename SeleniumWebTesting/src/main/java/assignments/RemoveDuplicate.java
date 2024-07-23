package assignments;

public class RemoveDuplicate {
	static int j;
	 public static void main(String[] args) {
		String name="Happy";
		char[] str=name.toCharArray();
		String result = "";
		
		for (int i = 0; i < name.length(); i++) {
			boolean matchFound = false;
			for (int j=i+1; j <name.length(); j++) {
				if (str[i]==str[j]) {
				  matchFound = true;
				  break;
				}
			}
			if(!matchFound) {
				result += str[i];
			}		
		}
		
		System.out.println(result);
	 }
}
		


