package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;

public class Login extends ProjectSpecificMethod{
	
	public Login username() {
		driver.findElement(By.id("username")).sendKeys();
		return this;
		}
	public Login password() {
		driver.findElement(By.id("password")).sendKeys();
        return this;
	}
	public Homepage login() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return new Homepage();

	}

}
