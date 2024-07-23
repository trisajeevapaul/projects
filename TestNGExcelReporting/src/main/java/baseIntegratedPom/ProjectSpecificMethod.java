package baseIntegratedPom;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.utils.FileUtil;

public class ProjectSpecificMethod {
	
	public ChromeDriver driver;
	public String excelfile;
	//step 1 to integrates
	//declaring ExtentReports as global variable with static access modifier
  
	public static ExtentReports extent;
	//step2
	public static ExtentTest Test;
	//step3
	public static String testName,testDescription,testCategory,testAuthor;
	public static ExtentTest test,node;
	@BeforeSuite
	public void startReport() {
		//adding step1to step 3 from extent reports
		///path
		ExtentHtmlReporter reporter=new ExtentHtmlReporter("Report/result.html");
		//to keep the report history
		reporter.setAppendExisting(true);
		//create object for ExtendReports
		// assign the created object to static variable - modified by Bovas
		extent =new ExtentReports();
	    //attach data with physical path
	    extent.attachReporter(reporter);
		}
	//step4
	@AfterSuite
	public void stopreport() {
		extent.flush(); 
	}
	//step 2
	@BeforeClass
	public void testcasedetails() {
		Test = extent.createTest(testName,testDescription);
	    Test.assignCategory(testCategory);
	    Test.assignAuthor(testAuthor);
	    
	}
	//step7
	public int takesnap() throws IOException {
		int random=(int)(Math.random()*99999+10000);
		File source = driver.getScreenshotAs(OutputType.FILE);
		File dest=new File("./snap/img"+random+".png");
		FileUtils.copyFile(source, dest);
		return random;
	}
	//step5
	public void reportstep(String status,String stepdesc) throws IOException {
		if(status.equalsIgnoreCase("pass")) {
		node.pass(stepdesc,MediaEntityBuilder.createScreenCaptureFromPath(".././snap/img"+takesnap()+".png").build());
		}
		else if(status.equalsIgnoreCase("fail")) {
		node.fail(stepdesc,MediaEntityBuilder.createScreenCaptureFromPath(".././snap/img"+takesnap()+".png").build());
		}
	}
	
	
	
	
	@BeforeMethod
	public void LaunchBrowser() {
		node = Test.createNode(testName);
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));      
	}
	//after  completing beforemethod it works
	@AfterMethod
	public void close() {
		driver.close();

	}
	
	
	//Data provoider for this class, mandatory to read excel to inputs modified by Bovas
	@DataProvider(name = "fetchdata")
	public String[][] getdata() throws IOException {
		//                  package.classname        constant
		String[][] getData =util.ReadExcel.inputData(excelfile);
		return getData;
		
	}

}
