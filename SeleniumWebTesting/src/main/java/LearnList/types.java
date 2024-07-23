package LearnList;

import java.util.ArrayList;
import java.util.List;

public class types {
	public static void main(String[] args) {
		List<String> name=new ArrayList <String>();
		name.add("Jeevapaul");
		name.add("Jeevakani");
		name.add("Bovas");
		name.add("Trisa");
		name.add("Merlin");
		name.add("Sibi");
		System.out.println(name);
		List<String> name1=new ArrayList <String>();
		name1.addAll(name);
		name1.add("sahana");
		System.out.println(name1.remove(6));
		System.out.println(name1.get(3));
		System.out.println(name1.isEmpty());
		List<String> name2=new ArrayList <String>();
		System.out.println(name2.isEmpty());
		
	}

}
