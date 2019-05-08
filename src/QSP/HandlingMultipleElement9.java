package QSP;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleElement9 {
	static
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}


	public static void main(String[] args) throws InterruptedException
	{
		
		    WebDriver driver=new ChromeDriver();
			driver.get("file:///C:/Users/Shekhar/Desktop/HTMLforQspider/Tables.html");
			  
			List<WebElement> allTable = driver.findElements(By.tagName("table"));
			
			int count=allTable.size();
			System.out.println("No of table =" +count);
		
		driver.close();
	}

}
