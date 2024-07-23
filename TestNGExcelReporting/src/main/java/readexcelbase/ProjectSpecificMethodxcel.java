package readexcelbase;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import util.ReadExcel;

public class ProjectSpecificMethodxcel {
    public  ChromeDriver driver;
    public String excelFile;
	@BeforeMethod
	public void LaunchBrowser() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		System.out.println("1----");
	}
	//after  completing beforemethod it works
	@AfterMethod
	public void close() {
		driver.close();

	}
	

	@DataProvider(name = "fetchdata")
	//get xcel
	public String[][] getdata() throws IOException {
		//                  package.classname        constant
		String[][] getData =util.ReadExcel.inputData(excelFile);
		return getData;
		
	}

}
