package LearnConstructor;
//learn static
public class college {
	//instance variable
	int rollnumber;
	String name;
	//static variable
	static String CollegeName="BNE";
	public college(String n,int r) {
		rollnumber=r;
		name=n;
		
		
	}
	private void report() {
		System.out.println(rollnumber+name+CollegeName);
	}
	public static void main(String[] args) {
		college student1=new college("jo",12);
		college student2=new college("mona",90);
		student1.report();
		student2.report();
	}

}
