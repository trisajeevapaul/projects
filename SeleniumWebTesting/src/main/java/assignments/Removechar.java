package assignments;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;



public class Removechar {
public static void main(String[] args) {
	String name="happy";
	Set<Character> dup=new LinkedHashSet<Character>();
	for (int i = 0; i < name.length(); i++)
    dup.add(name.charAt(i));
	//System.out.println(dup);
	for (Character ch : dup) {
		System.out.println(ch);
		
	}
}
}
