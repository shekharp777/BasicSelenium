package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IsEnabledMethod {
	static
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}


	public static void main(String[] args)
	{
		
		     WebDriver driver=new ChromeDriver();
			
			 driver.get("file:///C:/Users/Shekhar/Desktop/HTMLforQspider/LoginPage.html");
			
			WebElement u = driver.findElement(By.id("un"));
			boolean e = u.isEnabled();
			
			if(e)
			{
				u.clear();
				u.sendKeys("kiran");
				
			}
			else
			{
				System.out.println("disabled");
			}
			
		
	}

}
