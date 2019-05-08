package QSP;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleElement12 {
	static
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}


	public static void main(String[] args) throws InterruptedException
	{
		
		    WebDriver driver=new ChromeDriver();
			driver.get("file:///C:/Users/Shekhar/Desktop/HTMLforQspider/Tables.html");
			 
			WebElement e = driver.findElement(By.id("t1")); 
			List<WebElement> a = e.findElements(By.tagName("td"));
			int rowCount=a.size();
			System.out.println("No of cells in first table="+rowCount);
			
			WebElement ele = driver.findElement(By.id("t2")); 
			List<WebElement> b = ele.findElements(By.tagName("td"));
			int rowCount1=b.size();
			System.out.println("No of cells in second table="+rowCount1);
			
			int rowcount3=rowCount+rowCount1;
			System.out.println("No of cells in all table="+rowcount3);
			 
		driver.close();
	}

}
