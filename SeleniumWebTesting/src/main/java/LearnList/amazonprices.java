package LearnList;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class amazonprices {
      public static void main(String[] args) {
		
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("sarees",Keys.ENTER);
		List<WebElement> prices= driver.findElements(By.className("a-price-whole"));
		//System.out.println(prices.size());
		System.out.println(prices);
	   // for (int i = 0; i < prices.size(); i++) {
	    //	System.out.println(prices.get(i).getText());
			
		//}
		Set<WebElement> ele=new TreeSet<WebElement>(prices);
		for (WebElement each : prices) {
			String allprices=each.getText();
			System.out.println(allprices);
			
		}
      }
      
      
}
