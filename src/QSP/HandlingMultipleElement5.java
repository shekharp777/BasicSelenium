package QSP;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleElement5 {
	static
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}


	public static void main(String[] args) throws InterruptedException
	{
		
		    WebDriver driver=new ChromeDriver();
			driver.get("file:///C:/Users/Shekhar/Desktop/HTMLforQspider/Tables.html");
			 
			 
			List<WebElement> allTable = driver.findElements(By.xpath("//table[@id='t1']//tr"));
			List<WebElement> allTable2 = driver.findElements(By.xpath("//table[@id='t2']//tr"));
			
			int count=allTable.size();
			System.out.println("No of rows in first table =" +count);
			
			int count1=allTable2.size();
			System.out.println("No of rows in second Table ="+count1);
			
		driver.close();
	}

}
