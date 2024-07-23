package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazonsearch {
          public static void main(String[] args) {
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver=new ChromeDriver();
			driver.get(" https://www.amazon.com");
			driver.findElement(By.xpath("//input[@class='nav-input nav-progressive-attribute']")).sendKeys("kurtas");
			driver.findElement(By.xpath("//input[@value='Go']")).click();                                          
		    //driver.findElement(By.xpath("//input[text()='Search Amazon']")).click();
		   // driver.findElement(By.xpath("//input[@id()='twotabsearchtextbox']")).sendKeys("kurtas");
		    // driver.findElement(By.xpath("//input[@class()='nav-search']")).click();
			driver.findElement(By.xpath("(//span[contains(@class,'a-size-base-plus a-color')])[1]")).click();
          }
          
          
          
}
