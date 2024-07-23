package parallelPage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;
import parralelbase.ProjectSpecificMethodParallel;

public class Login extends ProjectSpecificMethodParallel{
	//constructor
	public Login(ChromeDriver driver) {
		//assigning driver to global variable
		this.driver=driver;
	}
	public Login username() {
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		return this;
		}
	public Login password() {
		driver.findElement(By.id("password")).sendKeys("crmsfa");
        return this;
	}
	public Homepage login() {
		driver.findElement(By.className("decorativeSubmit")).click();
		//constructor call
		return new Homepage(driver);

	}

}
