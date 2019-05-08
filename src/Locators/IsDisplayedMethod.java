package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IsDisplayedMethod {
	static
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
	}


	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
			
			driver.get("file:///C:/Users/Shekhar/Desktop/HTMLforQspider/LoginPage.html");
			try
			{
			WebElement login = driver.findElement(By.name("log"));
			login.isDisplayed();
			System.out.println("pass.........");
			}
			
			catch(Exception e)
			{
				System.out.println("fail........");
			}
			
			
					
			driver.close();
	}

}
