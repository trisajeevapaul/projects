package integratedpage;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentTest;

import baseIntegratedPom.ProjectSpecificMethod;


public class Login extends ProjectSpecificMethod{
	public Login(ChromeDriver driver,ExtentTest node)
	
	{
		this.driver=driver;
		this.node=node;
	}
	
	
	public Login username(String username) throws IOException {
		//step5
		try {
			driver.findElement(By.id("username")).sendKeys(username);
			reportstep("pass", username+"username entered succesfully");
		} catch (Exception e) {
			reportstep("fail",username+"username not entered succesfully"+e);
			e.printStackTrace();
		}
		return this;
		}
	public Login password(String password) throws IOException {
		try {
			driver.findElement(By.id("password")).sendKeys(password);
			reportstep("pass", password+"password entered succesfully");
		} catch (Exception e) {
			reportstep("fail",password+"password not entered succesfully"+e);
			e.printStackTrace();
		}
        return this;
	}
	public Homepage login() throws IOException {
		try {
			driver.findElement(By.className("decorativeSubmit")).click();
			reportstep("pass","login entered succesfully");
		} catch (Exception e) {
			reportstep("fail","login entered not succesfully"+e);
			e.printStackTrace();
		}
		return new Homepage(driver,node);

	}

public static void main(String[] args) {
	System.out.println("2---");
}	
}
