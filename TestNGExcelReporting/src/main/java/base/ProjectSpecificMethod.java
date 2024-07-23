package base;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ProjectSpecificMethod {
	//if error comes in line 12
	//when its sequential
	public static ChromeDriver driver;
	
	//when its parallel
	//public ChromeDriver driver;
	@BeforeMethod
	public void LaunchBrowser() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));      
	}
	//after  completing beforemethod it works
	@AfterMethod
	public void close() {
		driver.close();

	}

}
