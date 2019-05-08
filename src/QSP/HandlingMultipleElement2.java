package QSP;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleElement2 {
	static
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}


	public static void main(String[] args) throws InterruptedException
	{
		
		    WebDriver driver=new ChromeDriver();
			driver.get("file:///C:/Users/Shekhar/Desktop/HTMLforQspider/CheckBox.html");
			 
			 
			List<WebElement> allCb = driver.findElements(By.xpath("//input[@type='checkbox']"));
			
			int count=allCb.size();
			System.out.println("No of cb =" +count);
			
			for(int i=count; i>=0; i--)
			{
				try
				{
				allCb.get(i).click();
				}
				catch(Exception e)
				{
					
				}
				Thread.sleep(2000);
			}
			
		driver.close();
	}

}

