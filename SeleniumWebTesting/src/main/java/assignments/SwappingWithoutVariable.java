package assignments;

public class SwappingWithoutVariable {
public static void main(String[] args) {
	int x = 10;
	int y = 20;
		System.out.println("Before swap:");
		System.out.println("x value: "+x);
		System.out.println("y value: "+y);
		x=x^y;
		System.out.println(x);
		y=x^y;
		System.out.println(y);
		x=x^y;
		System.out.println(x);
		System.out.println("After swap:");
		System.out.println("x value: "+x);
		System.out.println("y value: "+y);
}
}
