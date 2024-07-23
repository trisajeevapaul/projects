package parallelPage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;
import parralelbase.ProjectSpecificMethodParallel;

public class Myhomepage extends ProjectSpecificMethodParallel{
	public Myhomepage(ChromeDriver driver) {
		//assigning driver to global variable
		this.driver=driver;
	}
	public MyLeadPage leads() {
		driver.findElement(By.linkText("Leads")).click();
        return new MyLeadPage(driver);
	}

}
