package advanceuserinteration;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class drop {
	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
	 		ChromeOptions options=new ChromeOptions();
	 		options.addArguments("--remote-allow-origins=*");
	 		ChromeDriver driver=new ChromeDriver(options);
	 		driver.get("https://jqueryui.com/draggable/");
	 		driver.manage().window().maximize();
	 		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	 		
	 		//locate the element for droppable
	 		driver.findElement(By.xpath("(//a[text()='Droppable'])")).click();
	 		//select the frame
	 		driver.switchTo().frame(0);
	 		//locate the source element
	 	
	 		
	 		WebElement source = driver.findElement(By.xpath("//div[@id='draggable'] "));
	 		//locate the destination
	 	
	 		WebElement des = driver.findElement(By.xpath("//div[@id='droppable']"));
	 		//actions
	 		Actions builder=new Actions(driver);
	 		//dragand drop webelement
	 		builder.dragAndDrop(source, des).perform();
	 		System.out.println(des.getCssValue("background-colour"));
	 		//to locate the element for draggable
	 		driver.switchTo().defaultContent();
	 		driver.findElement(By.xpath("(//a[text()='Draggable'])")).click();
	 		driver.switchTo().frame(0);
	 		WebElement src = driver.findElement(By.xpath("(//p[text()='Drag me around'])"));	
	 		//to get x and y location
	 		Point location = src.getLocation();
	 		//to get x location
	 		int x = location.getX();
	 		System.out.println(x);
	 		//to get y value
	 		int y = location.getY();
	 		System.out.println(y);
  	 		builder.dragAndDropBy(src, 10, 20).perform();
  	 		System.out.println(src.getLocation().getY());
	}

}
