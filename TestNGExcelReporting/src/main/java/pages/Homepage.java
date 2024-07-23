package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethod;

public class Homepage extends ProjectSpecificMethod{
	public Myhomepage crm() {
		driver.findElement(By.linkText("CRM/SFA")).click();
        return new Myhomepage();
	}

}
