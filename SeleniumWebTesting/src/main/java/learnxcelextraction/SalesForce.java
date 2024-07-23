package learnxcelextraction;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import week6.day1.ReadExcel;

public class SalesForce {

   @Test(dataProvider="fetchGroceryXcel")
	//@Test(dataProvider = "fetchSalesforceData")
	public void askQuestion(String question, String details) throws InterruptedException {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("hari.radhakrishnan@qeagle.com");

		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		Actions builder = new Actions(driver);
		password.sendKeys("Leaf@123", Keys.ENTER);
		Thread.sleep(5000);

		driver.findElement(By.xpath("(//button[contains(@class,'slds-icon-waffle_container')])")).click();
		driver.findElement(By.xpath("(//button[text()='View All'])")).click();
		driver.findElement(By.xpath("(//div[@class='slds-app-launcher__tile-body slds-truncate'])[4]")).click();
		Thread.sleep(5000);

		System.out.println("Element --> " + driver.findElement(By.xpath("(//a[@title='Chatter'])")).getText());
		WebElement element = driver.findElement(By.xpath("(//a[@title='Chatter'])"));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", element);

		driver.findElement(By.xpath("(//a[@title='Question'])")).click();
		driver.findElement(By.xpath("(//textarea[@class='cuf-questionTitleField textarea'])")).sendKeys(question);
		driver.findElement(By.xpath("//*[@id='outerContainer']/div[1]/div/div[1]/div[1]/p")).sendKeys(details);
		driver.findElement(By.xpath("(//button[@title='Click, or press Ctrl+Enter'])")).click();

	}

	//@DataProvider(name = "fetchSalesforceData")
	//public String[][] getdata() throws IOException {
		//String[][] inputData = learnxcelextraction.ReadExcel.inputData();
		//return inputData;
	//}
   @DataProvider(name="fetchGroceryXcel")
   public String[][] getdata() throws IOException{
	   String[][] grocerydata = GroceryXcel.grocerydata();
	   return grocerydata;
	   
   }
}
