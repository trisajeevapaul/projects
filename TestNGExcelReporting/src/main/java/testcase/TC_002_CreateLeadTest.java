package testcase;

import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.Login;
import readexcelbase.ProjectSpecificMethodxcel;

public class TC_002_CreateLeadTest extends ProjectSpecificMethod {
	@Test
	public void runcreateLead() {
		Login lp=new Login();
		lp.username().password().login().crm().leads().ClickCreateLead().FirstName().LastName().CompanyName()
		.ClickSubmit().verifyFirstName();
		

	}

}
