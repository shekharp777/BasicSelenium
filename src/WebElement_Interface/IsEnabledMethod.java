package WebElement_Interface;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledMethod {
	
	static 
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		System.setProperty("webdriver.ie.driver", "./drivers/IEDriverServer.exe");

	}

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/Shekhar/Desktop/HTML/LoginPage.html");
		try
		{
		WebElement u = driver.findElement(By.id("un"));
		boolean e = u.isEnabled();
	
			u.clear();
			u.sendKeys("shekhar");
			System.out.println("Enabled");
		
		}
		catch(Exception e)
		{
			System.out.println("Disabled");
		}
		Thread.sleep(2000);
		driver.close();
		
	}

}
