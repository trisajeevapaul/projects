package StaticPolymorphism;

public class mo {
	private int multiple(int a,int b) {
		return a*b;
		// TODO Auto-generated method stub

	}
	private int multiple(int a,int b,int c) {
		return a*b*c;
		// TODO Auto-generated method stub

	}
    public static void main(String[] args) {
		mo obj=new mo();
		System.out.println(obj.multiple(2, 3));
		System.out.println(obj.multiple(8, 9, 1));
	}
}
