package util;



import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class LearnExtendReport {
	public static void main(String[] args) throws IOException {
		//setup a  physical path for the report to save in respective folder
		ExtentHtmlReporter reporter=new ExtentHtmlReporter("Report/result.html");
		//to keep the report history
		reporter.setAppendExisting(true);
		//create object for ExtendReports
		ExtentReports extend=new ExtentReports();
	    //attach data with physical path
	    extend.attachReporter(reporter);
	    //create test case and assign test detail(testname,test description)
	    ExtentTest Test = extend.createTest("Login","Login Test for Leaftap Application");
	    //ExtentTest Test = extend.createTest("Login","Login Test for Leaftap Application");
	    //asign author
	    Test.assignCategory("smoke");
	    Test.assignAuthor("Trisa");
	    //step level status
	    Test.pass("Enter username");
	    Test.pass("password");
	    //attach the screenshot   ../control move out
	    Test.pass("click login button",MediaEntityBuilder.createScreenCaptureFromPath(".././snap/leaf.png").build());
	    //generetes start to end report its is manadatory line
	    extend.flush();
	    
	}

}
