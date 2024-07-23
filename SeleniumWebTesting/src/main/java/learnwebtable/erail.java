package learnwebtable;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class erail {

	public static void main(String[] args) throws InterruptedException {
		 WebDriverManager.chromedriver().setup();
	 		ChromeOptions options=new ChromeOptions();
	 		options.addArguments("--remote-allow-origins=*");
	 		ChromeDriver driver=new ChromeDriver(options);
	 		driver.get("https://erail.in/");
	 		driver.manage().window().maximize();
	 		//first clear a search box to enter
	 		driver.findElement(By.id("txtStationFrom")).clear();
	 		
	 		driver.findElement(By.id("txtStationFrom")).sendKeys("MAS",Keys.ENTER);
	 	    driver.findElement(By.id("txtStationTo")).clear();
	 		driver.findElement(By.id("txtStationTo")).sendKeys("MDU",Keys.ENTER);

	 		driver.findElement(By.id("chkSelectDateOnly")).click();
	 		//to locate table
	 		//WebElement table= driver.findElement(By.xpath("(//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader'])"));
	 		
	 		//List<WebElement> rowcount = table.findElements(By.tagName("tr"));
	 		//alternate to print rowcount
	 		Thread.sleep(5000);
	 		List<WebElement> row=driver.findElements(By.xpath("(//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader'])//tr"));
            System.out.println(row.size());
            //print column count
            List<WebElement> column = driver.findElements(By.xpath("(//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader'])//th"));
            System.out.println(column.size());
            WebElement element = driver.findElement(By.xpath("(//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader'])//tr[3]//td[2]"));
            System.out.println(element.getText());
            //to print row
            for (int i = 2; i <= row.size(); i++) {
            	String text = driver.findElement(By.xpath("(//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader'])//tr["+i+"]")).getText();
                System.out.println(text);
            }
            for (int i = 2; i <= row.size(); i++) {
              //to print colunm
                String text2 = driver.findElement(By.xpath("(//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader'])//tr["+i+"]/td[2]")).getText();
                System.out.println(text2);
                
            
				
            }
                
				
			}
            
            //to print the column
           
            
            
	}
	


