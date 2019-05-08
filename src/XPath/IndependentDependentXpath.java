package XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IndependentDependentXpath {
	
	static
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		System.setProperty("webdriver.ie.driver", "./drivers/IEDriverServer.exe");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/Shekhar/Desktop/HTML/IndependentDependent.html");
		
		//Independent xpath.
		driver.findElement(By.xpath("//td[.='Bahubali-2']")).click();
		driver.navigate().back();
		
		//dependent xpath.
		driver.findElement(By.xpath("//td[.='Bahubali-2']/../td[2]")).click();
		driver.navigate().back();
		
		Thread.sleep(2000);
		driver.close();
		
	}

}
