package advanceuserinteration;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class scroll {

	public static void main(String[] args) throws InterruptedException, IOException {
		 WebDriverManager.chromedriver().setup();
	 		ChromeOptions options=new ChromeOptions();
	 		options.addArguments("--remote-allow-origins=*");
	 		ChromeDriver driver=new ChromeDriver(options);
	 		driver.get("https://www.nykaa.com/");
	 		driver.manage().window().maximize();
	 		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	 		//scroll
	 		WebElement till = driver.findElement(By.xpath("(//a[text()='Privacy Policy'])"));
	 		Actions builder=new Actions(driver);
	 		Thread.sleep(2000);
	 		builder.scrollToElement(till).perform();
	 	    //Take a snapshot
	 		File source= driver.getScreenshotAs(OutputType.FILE);
	 		//create folder to save a image
	 		File dest=new File("./snap/img1.png");
	 		//merge source and destination
	 		FileUtils.copyFile(source, dest);
	 		

	}

}
