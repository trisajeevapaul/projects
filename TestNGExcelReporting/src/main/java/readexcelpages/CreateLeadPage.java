package readexcelpages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import readexcelbase.ProjectSpecificMethodxcel;

public class CreateLeadPage extends ProjectSpecificMethodxcel{
	public CreateLeadPage(ChromeDriver driver) {
		//assigning driver to global variable
		this.driver=driver;
	}
	
	public CreateLeadPage FirstName(String firstname) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstname);
		return this;

	}
	public CreateLeadPage LastName(String lastname) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastname);
		return this;

	}
	public CreateLeadPage CompanyName(String companyname) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyname);
		return this;

	}
	public viewLeadPage ClickSubmit() {
		driver.findElement(By.name("submitButton")).click();
		return new viewLeadPage(driver);


	}
}




