package assignments;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Screenshot {
	public static void main(String[] args) throws IOException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Actions builder=new Actions(driver);
		WebElement searchBox = driver.findElement(By.xpath("//textarea[@title='Search']"));
		searchBox.sendKeys("teacher",Keys.ENTER);
		//to take screenshot
		File source= driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./trisasnap/img1.png");
		FileUtils.copyFile(source, dest);
	    driver.quit();
	}

}
