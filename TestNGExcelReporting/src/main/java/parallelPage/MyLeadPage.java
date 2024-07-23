package parallelPage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;
import parralelbase.ProjectSpecificMethodParallel;

public class MyLeadPage extends ProjectSpecificMethodParallel{
	public MyLeadPage(ChromeDriver driver) {
	
		this.driver=driver;
	}
	
	public CreateLeadPage ClickCreateLead() {
		driver.findElement(By.linkText("Create Lead")).click();
		return new CreateLeadPage(driver);

	}
	

}
