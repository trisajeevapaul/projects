package readexceltestcase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import readexcelbase.ProjectSpecificMethodxcel;
import readexcelpages.Login;

public class TC_001_LoginTest extends ProjectSpecificMethodxcel{
	@BeforeTest
	public void setup() {
		excelFile = "login";
	}
	
	@Test(dataProvider = "fetchdata")
	public void runLogin(String username,String password) {
	Login lp=new Login(driver);
	lp.username(username).password(password).login();

	}
	public static void main(String[] args) {
		System.out.println("3-----");
	}

}
