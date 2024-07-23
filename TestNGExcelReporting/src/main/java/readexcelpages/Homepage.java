package readexcelpages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;
import readexcelbase.ProjectSpecificMethodxcel;

public class Homepage extends ProjectSpecificMethodxcel{
	public Homepage(ChromeDriver driver) {
		//assigning driver to global variable
		this.driver=driver;
	}

	public Myhomepage crm() {
		driver.findElement(By.linkText("CRM/SFA")).click();
        return new Myhomepage(driver);
	}

}
