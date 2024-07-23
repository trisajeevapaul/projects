package testcase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class projectspecificmethod {
	//pass global for driver
public 	ChromeDriver driver;
@BeforeMethod
	public void preCondition() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
        //we pass global for driver so we remove chromedriver
		//ChromeDriver driver = new ChromeDriver(options); 
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		


	}
@AfterMethod
private void postCondition() {
	driver.close();

}
}
