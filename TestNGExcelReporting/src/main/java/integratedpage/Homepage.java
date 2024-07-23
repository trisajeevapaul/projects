package integratedpage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentTest;

import base.ProjectSpecificMethod;
import readexcelbase.ProjectSpecificMethodxcel;

public class Homepage extends ProjectSpecificMethodxcel{
	private ExtentTest node;

	public Homepage(ChromeDriver driver, ExtentTest node) {
		//assigning driver to global variable
		this.driver=driver;
		this.node=node;
	}

	public Myhomepage crm() {
		driver.findElement(By.linkText("CRM/SFA")).click();
        return new Myhomepage(driver,node);
	}

}
