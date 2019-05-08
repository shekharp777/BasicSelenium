package QSP;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingMultipleElements {
	static
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}


	public static void main(String[] args)
	{
		
		     WebDriver driver=new ChromeDriver();
			 driver.get("file:///C:/Users/Shekhar/Desktop/HTMLforQspider/LoginPage.html");
			 
			 
			List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
			
			int count=allLinks.size();
			System.out.println("No Of Links=" +count);
			
			for(int i=0; i<count; i++)
			{
				WebElement link = allLinks.get(i);
				String text=link.getText();
				System.out.println("Links are:"+text);
			}
			
		driver.close();
	}

}


