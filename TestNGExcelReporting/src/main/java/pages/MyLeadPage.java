package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethod;

public class MyLeadPage extends ProjectSpecificMethod{
	public CreateLeadPage ClickCreateLead() {
		driver.findElement(By.linkText("Create Lead")).click();
		return new CreateLeadPage();

	}
	

}
