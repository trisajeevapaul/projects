package integratedpage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentTest;

import base.ProjectSpecificMethod;
import readexcelbase.ProjectSpecificMethodxcel;

public class MyLeadPage extends ProjectSpecificMethodxcel{
	public MyLeadPage(ChromeDriver driver, ExtentTest node) {
		//assigning driver to global variable
		this.driver=driver;
	}
	public CreateLeadPage ClickCreateLead() {
		driver.findElement(By.linkText("Create Lead")).click();
		return new CreateLeadPage(driver,node);

	}
	

}
