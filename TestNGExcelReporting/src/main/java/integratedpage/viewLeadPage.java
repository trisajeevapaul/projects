package integratedpage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentTest;

import base.ProjectSpecificMethod;
import readexcelbase.ProjectSpecificMethodxcel;

public class viewLeadPage extends ProjectSpecificMethodxcel{
	public viewLeadPage(ChromeDriver driver, ExtentTest node) {
		//assigning driver to global variable
		this.driver=driver;
	}
	public viewLeadPage verifyFirstName() {
		String text = driver.findElement(By.id("viewLead_firstName_sp"))
				.getText();
		System.out.println(text);
		return this;

	}

}