package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Zoomcar {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.smilecars.net");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));      
		driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("medavakkam");
	//formSearchUpLocation2
        driver.findElement(By.xpath("//input[@name='dropOff']")).sendKeys("meenampakkam");
        
        //pickupDate
       WebElement dateElement = driver.findElement(By.xpath("//input[@name='pickupDate']"));
        dateElement.clear();
        dateElement.sendKeys("");
        dateElement.sendKeys("10/03/2023");
       
        
        //pickupTime
        WebElement timeElement = driver.findElement(By.xpath("//input[@name='pickupTime']"));
        timeElement.click();
        timeElement.sendKeys("");
        timeElement.sendKeys("12:00 AM");
        
        //formSearchSubmit2
        //driver.findElement(By.xpath("//button[@class='btn btn-submit btn-theme']")).click();
        
	}

}
