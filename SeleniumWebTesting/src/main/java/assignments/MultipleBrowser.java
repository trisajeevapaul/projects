package assignments;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class MultipleBrowser {

	public static RemoteWebDriver driver;

	public static void main(String[] args) {
		openBrowser("chrome");
		openBrowser("Edge");
	}

	private static void openBrowser(String browser) {
		switch (browser) {
			case "chrome": {
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--remote-allow-origins=*");
	
				driver = new ChromeDriver(options);
				break;
			}
			case "Edge": {
				driver = new EdgeDriver();
				break;
			}
		}

		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
}
