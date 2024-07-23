package week2.day2;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Missingdropdown {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentabs/control/main");
        
	}

}
