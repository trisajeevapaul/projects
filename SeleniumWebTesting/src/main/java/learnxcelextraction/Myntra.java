package learnxcelextraction;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Myntra {
	
	@Test(dataProvider="fetchshopping")
	//header name inside string
	public  void myntraxcel(String items) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		WebElement search = driver.findElement(By.className("desktop-searchBar"));
		search.clear();
		search.getText();
		//header name
		search.sendKeys(items,Keys.ENTER);
		driver.close();
		

	}
	//data preparation
	@DataProvider(name="fetchshopping")
	//method name as ur wish
	public String[][] putdata() throws IOException {
		//string two dimensional local variable=class name, method call
		String[][] shoppingdata= ReadExcel.inputData();
		return shoppingdata;
		
		
	}

}
