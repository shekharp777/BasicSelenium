package QSP;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleElement10 {
	static
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}


	public static void main(String[] args) throws InterruptedException
	{
		
		    WebDriver driver=new ChromeDriver();
			driver.get("file:///C:/Users/Shekhar/Desktop/HTMLforQspider/Tables.html");
			 
			WebElement element = driver.findElement(By.id("t1")); 
			List<WebElement> a = element.findElements(By.tagName("tr"));
			int rowCount=a.size();
			System.out.println("No of rows in first table="+rowCount);
			
			WebElement element1 = driver.findElement(By.id("t2")); 
			List<WebElement> b = element1.findElements(By.tagName("tr"));
			int rowCount1=b.size();
			System.out.println("No of rows in second table="+rowCount1);
			
			List<WebElement> c = driver.findElements(By.tagName("tr"));
			int rowCount2=c.size();
			System.out.println("No of rows in all table="+rowCount2);
			 
		driver.close();
	}

}
