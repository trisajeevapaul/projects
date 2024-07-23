package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethod;

public class CreateLeadPage extends ProjectSpecificMethod{
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
		return new viewLeadPage();


	}
}




