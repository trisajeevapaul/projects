package assignments;

import org.apache.commons.math3.analysis.function.Add;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.sun.org.apache.xpath.internal.operations.Div;

public class BaseTestng {
	@BeforeMethod
	public static void add() {
	System.out.println("add");
	System.out.println("sub");

	}
	@AfterMethod
	public static void div() {
	System.out.println("mul");
	System.out.println("div");
	}
	public static void main(String[] args) {
		BaseTestng.add();
		BaseTestng.div();
		
	}
	}
    
