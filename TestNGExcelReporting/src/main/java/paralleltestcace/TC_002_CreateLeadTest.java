package paralleltestcace;

import org.testng.annotations.Test;
import parallelPage.Login;
import parralelbase.ProjectSpecificMethodParallel;

public class TC_002_CreateLeadTest extends ProjectSpecificMethodParallel {
	@Test
	public void runcreateLead() {
		Login lp=new Login(driver);
		lp.username().password().login().crm().leads().ClickCreateLead().FirstName().LastName().CompanyName()
		.ClickSubmit().verifyFirstName();
		

	}

}
