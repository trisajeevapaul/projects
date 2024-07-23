package Learnframe;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class frame {
     public static void main(String[] args) {
    	 WebDriverManager.chromedriver().setup();
 		ChromeOptions options=new ChromeOptions();
 		options.addArguments("--remote-allow-origins=*");
 		ChromeDriver driver=new ChromeDriver(options);
 		driver.get("https://www.leafground.com/frame.xhtml");
 		driver.manage().window().maximize();
 		driver.switchTo().frame(0);
 		driver.findElement(By.xpath("(//button[text()='Click Me'])")).click();
 		String text = driver.findElement(By.xpath("(//button[contains(text(),'Hurray')])")).getText();
        System.out.println(text); 
        //switch back to parent frame
        driver.switchTo().defaultContent();
        //select the frame
        driver.switchTo().frame(2);
        //becoz it is nested frame it has another frame
        driver.switchTo().frame("frame2");
        
        driver.findElement(By.xpath("(//button[text()='Click Me'])")).click();
        driver.findElement(By.xpath("(//button[text()='Click Me'])")).click();
 		String text1 = driver.findElement(By.xpath("(//button[contains(text(),'Hurray')])")).getText();
        System.out.println(text1); 
        
        
        driver.switchTo().frame(0);
        
	}
}

