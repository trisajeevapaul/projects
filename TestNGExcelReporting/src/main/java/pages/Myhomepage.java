package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethod;

public class Myhomepage extends ProjectSpecificMethod{
	public MyLeadPage leads() {
		driver.findElement(By.linkText("Leads")).click();
        return new MyLeadPage();
	}

}
