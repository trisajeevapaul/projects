package integratedTest;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import baseIntegratedPom.ProjectSpecificMethod;
import integratedpage.Login;

public class TC_001_LoginTest extends ProjectSpecificMethod{
	@BeforeTest
	public void setup() {
		excelfile = "login";
		testName="loginTest";
		testDescription="leaftablogin";
		testCategory="smoke";
		testAuthor="Trisa";
	}
	
	@Test(dataProvider = "fetchdata")
	public void runLogin(String username,String password) throws IOException {
	Login lp=new Login(driver,node);
	lp.username(username).password(password).login();
    
	}
	

}
