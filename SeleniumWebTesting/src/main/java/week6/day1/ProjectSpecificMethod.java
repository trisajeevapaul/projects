package week6.day1;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class ProjectSpecificMethod {

	protected RemoteWebDriver driver;
	protected String excelFile;

	@BeforeMethod
	@Parameters({ "browser", "url", "username", "password" })
	public void preCondition(String browser, String url, String uname, String pwd) {
		switch (browser) {
			case "chrome":
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--remote-allow-origins=*");
				driver = new ChromeDriver(options);
				break;
			case "edge":
				driver = new EdgeDriver();
				break;
		}
		driver.get(url);
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys(uname);
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
	}

	@DataProvider(name = "fetchdata")
	public String[][] getdata() throws IOException {
		String[][] inputData = ReadExcel.inputData(excelFile);
		return inputData;
	}

}
