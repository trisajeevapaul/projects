package Learnframe;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class W3schools {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		driver.manage().window().maximize();
		//String "iframeResult";
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("(//button[text()='Try it'])")).click();
		//switching to alert
		Alert Schools= driver.switchTo().alert();
		//capturing the alert
		String text2 = Schools.getText();
		
	   //accept the alert
		Schools.accept();
		System.out.println(text2);
		//String text = driver.findElement(By.xpath("//p[@id='demo']")).getText();
		//System.out.println(text);
		
		
		
		
		
		
}
}
