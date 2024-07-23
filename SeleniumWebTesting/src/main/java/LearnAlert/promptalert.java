package LearnAlert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class promptalert {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		//driver.findElement(By.xpath("(//span[text()='Show'])[5]")).sendKeys("Trisa");
		Alert alertprompt = driver.switchTo().alert(); //not inspectable so using 
		String text = alertprompt.getText();//to type message present inside the alert
		//System.out.println(text);
		alertprompt.sendKeys("Trisa");
		//Thread.sleep(3000);
		alertprompt.accept();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[id()='confirm_result'])[5]")).click();
		System.out.println(text);
		
		
		
		
		
	}

}
