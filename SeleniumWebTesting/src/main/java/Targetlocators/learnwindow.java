package Targetlocators;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class learnwindow {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
 		ChromeOptions options=new ChromeOptions();
 		options.addArguments("--remote-allow-origins=*");
 		ChromeDriver driver=new ChromeDriver(options);
 		driver.get("https://www.irctc.co.in/");
 		driver.manage().window().maximize();
 		driver.findElement(By.xpath("(//a[text()=' FLIGHTS '])")).click();
 		//step1
 	    Set<String> WindowHandles=driver.getWindowHandles();
 	    //step2 convert set into list
 	    List<String> list1=new ArrayList <String>(WindowHandles);
 	    // step3 switch to window
 	    driver.switchTo().window(list1.get(1));
 	    System.out.println(driver.getTitle());
 	    //close the current window
        driver.close();
        //switch to parent window
        driver.switchTo().window(list1.get(0));
        System.out.println(driver.getTitle());
        //driver.quit();
	}


}
