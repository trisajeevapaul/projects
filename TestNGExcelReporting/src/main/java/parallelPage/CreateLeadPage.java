package parallelPage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import parralelbase.ProjectSpecificMethodParallel;

public class CreateLeadPage extends ProjectSpecificMethodParallel{
	public CreateLeadPage(ChromeDriver driver) {
		//assigning driver to global variable
		this.driver=driver;
	}
	
	public CreateLeadPage FirstName() {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Hari");
		return this;

	}
	public CreateLeadPage LastName() {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
		return this;

	}
	public CreateLeadPage CompanyName() {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		return this;

	}
	public viewLeadPage ClickSubmit() {
		driver.findElement(By.name("submitButton")).click();
		return new viewLeadPage(driver);


	}
}




