package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethod;

public class viewLeadPage extends ProjectSpecificMethod{
	public viewLeadPage verifyFirstName() {
		String text = driver.findElement(By.id("viewLead_firstName_sp"))
				.getText();
		System.out.println(text);
		return this;

	}

}
