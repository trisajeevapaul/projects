package week6.day1;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Createlead extends ProjectSpecificMethod {
	
	@BeforeTest
	public void setup() {
		excelFile = "CreateLead";
	}
	
	@Test(dataProvider = "fetchdata")
	public void createLead(String cname, String fname, String lname, String phoneNum) {
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
	}
}
