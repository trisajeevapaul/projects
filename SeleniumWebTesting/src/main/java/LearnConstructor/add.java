package LearnConstructor;

public class add {
	static int count=0;//will get memory only once and retain its value

	add(){
	count++;
	System.out.println(count);
	}

	public static void main(String args[]){

	add c1=new add();
	add c2=new add();
	add c3=new add();

	 }


}
