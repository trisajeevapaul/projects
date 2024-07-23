package assignments;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDupChar {
	private static void removeduplicate(String str) {

	        LinkedHashSet<Character> set = new LinkedHashSet<Character>();   
	        //Add each character of the string into LinkedHashSet   
	        for(int i=0;i<str.length();i++)   
	            set.add(str.charAt(i));   
	            
	        // print the string after removing duplicate characters   
	        for(Character ch : set)   
	            System.out.print(ch);   
	    }   
	        
	    //main() method start  
	    public static void main(String args[])   
	    {   
	        //Create string variable with default value  
	        String str = "happy";   
	        //removeDuplicates() method by passing the string as an argument   
	        removeduplicate(str);   
	    }   
	} 

