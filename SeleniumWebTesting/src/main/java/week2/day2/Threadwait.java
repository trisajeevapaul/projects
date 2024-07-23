package week2.day2;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Threadwait {
	//private static Object Webdrivermanager;

	public static void main(String[] args) {
		//Object Webdrivermanager;
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.smilecars.net");
	}

}
