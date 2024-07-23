package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumTest {
	public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentabs/control/main");
        driver.get("https://in.pinterest.com/login/");
	}
}
