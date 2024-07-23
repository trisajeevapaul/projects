package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FileUploadTest {

	public static void main(String[] args) throws InterruptedException {
		// Set the path to the chromedriver executable
		// System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");

		// Launch the Chrome browser
 		ChromeOptions options=new ChromeOptions();
 		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);

		// Navigate to the file upload page
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");

		// Locate the file input element and send the file path to it
		WebElement fileInput = driver.findElement(By.name("upfile"));
		fileInput.sendKeys("C:\\Users\\trisa\\git\\learning\\Learnselenium\\testfile.txt");

		// Submit the form to upload the file
		WebElement uploadButton = driver.findElement(By.xpath("(//input[@type='submit'])"));
		uploadButton.click();

		Thread.sleep(1000);
		// Verify that the file was uploaded successfully
		WebElement successMessage = driver.findElement(By.xpath("(/html/body/pre)"));
		if (successMessage.getText().contains("Test")) {
			System.out.println("File upload test passed.");
		} else {
			System.out.println("File upload test failed.");
		}

		// Close the browser
		driver.quit();
	}
}
