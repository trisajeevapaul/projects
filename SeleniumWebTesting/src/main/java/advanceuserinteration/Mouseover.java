package advanceuserinteration;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mouseover {
    public static void main(String[] args) {
    	 WebDriverManager.chromedriver().setup();
	 		ChromeOptions options=new ChromeOptions();
	 		options.addArguments("--remote-allow-origins=*");
	 		ChromeDriver driver=new ChromeDriver(options);
	 		driver.get("https://www.nykaa.com/");
	 		driver.manage().window().maximize();
	 		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	 		WebElement makeup = driver.findElement(By.xpath("(//a[text()='makeup'])[2]"));
	 		Actions builder=new Actions(driver);
	 		//mouse over action in element
	 		builder.moveToElement(makeup).perform();
	 	
	}
}
