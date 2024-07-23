package integratedpage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentTest;

import base.ProjectSpecificMethod;
import readexcelbase.ProjectSpecificMethodxcel;

public class Myhomepage extends ProjectSpecificMethodxcel{
	public Myhomepage(ChromeDriver driver, ExtentTest node) {
		this.driver=driver;
	}
	public MyLeadPage leads() {
		driver.findElement(By.linkText("Leads")).click();
        return new MyLeadPage(driver,node);
	}

}
