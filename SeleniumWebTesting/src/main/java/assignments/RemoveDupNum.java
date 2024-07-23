package assignments;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.poi.ss.formula.functions.Na;

public class RemoveDupNum {
public static void main(String[] args) {
	 List<Integer>list1 = new ArrayList<Integer>();
	list1.add(200);
	list1.add(300);
	list1.add(300);
	list1.add(500);
	list1.add(800);
	HashSet<Integer>set = new HashSet<Integer>(list1);
	List<Integer>list2 = new ArrayList<Integer>(set);
	System.out.println(list2);
	for (Object ob: list2)
        System.out.println(ob);
}
}
				
		

