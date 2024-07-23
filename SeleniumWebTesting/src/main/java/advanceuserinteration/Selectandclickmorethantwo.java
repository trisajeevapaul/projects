package advanceuserinteration;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selectandclickmorethantwo {

	

	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
	 		ChromeOptions options=new ChromeOptions();
	 		options.addArguments("--remote-allow-origins=*");
	 		ChromeDriver driver=new ChromeDriver(options);
	 		driver.get("https://jqueryui.com/selectable/");
	 		driver.manage().window().maximize();
	 		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	       // driver.findElement(By.xpath("(//a[text()='Sortable'])")).click();
	        driver.switchTo().frame(0);
	        WebElement item1 = driver.findElement(By.xpath("(//li[text()='Item 1'])"));
	        WebElement item5= driver.findElement(By.xpath("(//li[text()='Item 5'])"));
	        Actions builder=new Actions(driver);
	        builder.click(item1).clickAndHold(item5).perform();
	        //builder.click(item1).click(item5);
	        
	                
	 	

	}

}
