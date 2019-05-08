package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IdExample {

	static
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		System.setProperty("webdriver.ie.driver", "./drivers/IEDriverServer.exe");
	}
	
	public static void main(String[] args) {

		WebDriver driver=new FirefoxDriver();
		
		driver.get("file:///C:/Users/Shekhar/Desktop/HTML/LoginPage.html");
		By i = By.id("un");
		
		WebElement un=driver.findElement(i);
		un.sendKeys("rakesh");
		
	}

}
