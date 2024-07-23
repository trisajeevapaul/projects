package week2.day1;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchAWSSSO {
	public static void main(String[] args) throws InterruptedException, IOException {
		
		char[] pwd = readPassword("Enter password: ");
		String code = readLine("Enter code: ");
		
        WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://hidcloud.awsapps.com/start/");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		driver.findElement(By.id("awsui-input-0")).sendKeys("bovchi");
		driver.findElement(By.id("username-submit-button")).click();
		Thread.sleep(3000);
		System.out.println(pwd.toString() + "---" + code);
		driver.findElement(By.id("awsui-input-1")).sendKeys(new String(pwd));
		driver.findElement(By.id("password-submit-button")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("awsui-input-2")).sendKeys(code);
		driver.findElement(By.className("awsui-signin-button-container")).click();
		Thread.sleep(10000);
		driver.findElement(By.tagName("portal-application")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[contains(text(), 'HID TMT - Production')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[contains(text(), 'Management console')]")).click();
	}
	
	private static String readLine(String format, Object... args) throws IOException {
	    if (System.console() != null) {
	        return System.console().readLine(format, args);
	    }
	    System.out.print(String.format(format, args));
	    BufferedReader reader = new BufferedReader(new InputStreamReader(
	            System.in));
	    return reader.readLine();
	}

	private static char[] readPassword(String format, Object... args)
	        throws IOException {
	    if (System.console() != null)
	        return System.console().readPassword(format, args);
	    return readLine(format, args).toCharArray();
	}
}
