package QSP;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleElement13 {
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
			List<WebElement> allContents = e.findElements(By.tagName("td"));
			
			int count=allContents.size();
			System.out.println("\nNo of cells in first table =" +count);
			System.out.println("The contents of first table is: \n");
			for(WebElement cells:allContents)
			{
				String text = cells.getText();
				System.out.println(text);
			}
			
			
			WebElement e1 = driver.findElement(By.id("t2")); 
			List<WebElement> allContents1 = e1.findElements(By.tagName("td"));
			
			int count1=allContents1.size();
			System.out.println("\nNo of cells in second table =" +count1);
			System.out.println("The contents of second table is: \n");
			for(WebElement cells1:allContents1)
			{
				String text = cells1.getText();
				System.out.println(text);
			}
			
			
		driver.close();
	}

}
