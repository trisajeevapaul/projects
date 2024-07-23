package Learnframe;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;

public class Snippet {
	WebDriverManager.chromedriver().setup();
			ChromeOptions options=new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			ChromeDriverService driver=new ChromeDriver(driver);
			driver.get("https://www.leafground.com/alert.xhtml");
			driver.manage().window().maximize();
}

