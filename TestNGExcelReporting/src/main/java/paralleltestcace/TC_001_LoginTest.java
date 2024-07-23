package paralleltestcace;

import org.testng.annotations.Test;
import parallelPage.Login;
import parralelbase.ProjectSpecificMethodParallel;

public class TC_001_LoginTest extends ProjectSpecificMethodParallel{
	@Test
	public void runLogin() {
	Login lp=new Login(driver);
	lp.username().password().login();

	}

}
