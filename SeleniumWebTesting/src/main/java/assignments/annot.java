package assignments;

import javax.swing.text.html.HTMLDocument.HTMLReader.HiddenAction;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class annot {
	
	@BeforeSuite
	private void first() {
		System.out.println("first");
		
		
	}
	@Test
	@BeforeClass
	private void second() {
		System.out.println("second");

	}
	@BeforeMethod
	private void third() {
		System.out.println("third");

	}	
	@BeforeTest
	private void fourth() {
		System.out.println("fourth");

	}	
	@AfterSuite
	private void five() {
		System.out.println("five");

	}	
	public static void main(String[] args) {
		
	}
	
}
