package readexcelpages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import readexcelbase.ProjectSpecificMethodxcel;

public class Login extends ProjectSpecificMethodxcel{
	public Login(ChromeDriver driver) {
		this.driver=driver;
	}
	
	
	public Login username(String username) {
		driver.findElement(By.id("username")).sendKeys(username);
		return this;
		}
	public Login password(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
        return this;
	}
	public Homepage login() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return new Homepage(driver);

	}

public static void main(String[] args) {
	System.out.println("2---");
}	
}
