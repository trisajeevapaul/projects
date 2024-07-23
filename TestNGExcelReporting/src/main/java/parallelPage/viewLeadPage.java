package parallelPage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;
import parralelbase.ProjectSpecificMethodParallel;

public class viewLeadPage extends ProjectSpecificMethodParallel{
	public viewLeadPage(ChromeDriver driver) {
		//assigning driver to global variable
		this.driver=driver;
	}
	
	public viewLeadPage verifyFirstName() {
		String text = driver.findElement(By.id("viewLead_firstName_sp"))
				.getText();
		System.out.println(text);
		return this;

	}

}
