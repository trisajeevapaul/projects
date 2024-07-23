package readexcelpages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;
import readexcelbase.ProjectSpecificMethodxcel;

public class Myhomepage extends ProjectSpecificMethodxcel{
	public Myhomepage(ChromeDriver driver) {
		this.driver=driver;
	}
	public MyLeadPage leads() {
		driver.findElement(By.linkText("Leads")).click();
        return new MyLeadPage(driver);
	}

}
