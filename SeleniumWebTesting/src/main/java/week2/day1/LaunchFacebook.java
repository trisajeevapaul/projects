
package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchFacebook {
	@Parameters({"url","username","password"})
	@BeforeMethod
	public void precondition(String url,String username,String password) throws InterruptedException  {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
        WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver(options);
		driver.get(url);
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Trisa");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("jeevapaul");
		WebElement source= driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select drop1=new Select(source);
		Thread.sleep(2000);
		drop1.selectByValue("LEAD_COLDCALL");
		WebElement country = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select drop=new Select(country);
		drop.selectByVisibleText("India");
		//}
		
		
		//driver.findElement(By.name("submitButton")).click();
        //String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
        //System.out.println(text);
        //if(text.contains("Testleaf"))
        	//System.out.println("lead is created");
        //else
        	//System.out.println("lead is not created");
		}
	
		@Test
		
		() {
			
		}
}
