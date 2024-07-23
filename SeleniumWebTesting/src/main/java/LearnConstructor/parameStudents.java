package LearnConstructor;

public class parameStudents {
	String name;
	int id;
	public parameStudents(String n,int i) {
		id=i;
		name=n;
	}
	private void display() {
		System.out.println(name+id);

	}
	public static void main(String[] args) {
		parameStudents student1=new parameStudents("Trisa",901);
		parameStudents student2=new parameStudents("Hema",902);
		student1.display();
		student2.display();
		
	}
	

}
