package MethodsOfWebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QExample {
	
	static
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		System.setProperty("webdriver.ie.driver", "./drivers/IEDriverServer.exe");
	}

	public static void main(String[] args) throws InterruptedException {

		System.out.println("hello");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("http://www.naukri.com");
		 
		Thread.sleep(2000);
		
		driver.quit();
	}

}
