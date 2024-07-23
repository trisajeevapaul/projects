package parallelPage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import parralelbase.ProjectSpecificMethodParallel;

public class Homepage extends ProjectSpecificMethodParallel{
	public Homepage(ChromeDriver driver) {
		
		this.driver=driver;
	}
	public Myhomepage crm() {
		driver.findElement(By.linkText("CRM/SFA")).click();
        return new Myhomepage(driver);
	}

}
