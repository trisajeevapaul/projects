package testcase;

import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.Login;

public class TC_001_LoginTest extends ProjectSpecificMethod{
	@Test
	public void runLogin() {
	Login lp=new Login();
	lp.username().password().login();

	}

}
