package readexceltestcase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import readexcelpages.CreateLeadPage;
import readexcelpages.Login;
import readexcelbase.ProjectSpecificMethodxcel;

public class TC_002_CreateLeadTest extends ProjectSpecificMethodxcel{
	@BeforeTest
	public void setup() {
		excelFile = "createlead";
	}
	
	@Test(dataProvider="fetchdata")
	public void runcreateLead(String username,String password,String firstname,String lastname,String companyname) {
		Login lp=new Login(driver);
		lp.username(username).password(password).login().crm().leads()
		.ClickCreateLead()
		.FirstName(firstname).LastName(lastname)
		.CompanyName(companyname)
		.ClickSubmit().verifyFirstName();
		

	}

}
