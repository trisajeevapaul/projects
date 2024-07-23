package LearnWait;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class elementtToVisible {
	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
        driver.get("https://www.leafground.com/waits.xhtml");
        WebElement visible = driver.findElement(By.xpath("(//span[text()='Click'])[1]"));
        visible.click();
        //fluent 
        FluentWait wait=new FluentWait(driver);
        wait.withTimeout(Duration.ofSeconds(30));
        wait.pollingEvery(Duration.ofSeconds(2));
        wait.ignoring(NoSuchElementException.class);
        //explicit 
        //WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
        //wait.until(ExpectedConditions.visibilityOf(visible));
        //verification
        WebElement text = driver.findElement(By.xpath("(//span[text()='I am here'])"));
        System.out.println(text.getText());
        driver.close();

	}

}
