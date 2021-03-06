package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CssSelectorExample {

	
	static
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		System.setProperty("webdriver.ie.driver", "./drivers/IEDriverServer.exe");
	}
	
	
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new FirefoxDriver();
		
		driver.get("file:///C:/Users/Shekhar/Desktop/HTML/LoginPage.html");
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Shekhar");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("pass123");
		
	
		Thread.sleep(2000);
		driver.close();
		
	}

}
