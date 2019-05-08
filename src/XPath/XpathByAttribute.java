package XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByAttribute {

	static
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		System.setProperty("webdriver.ie.driver", "./drivers/IEDriverServer.exe");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/Shekhar/Desktop/HTML/SamplePage.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@class='a']")).sendKeys("A");
		driver.findElement(By.xpath("//input[@class='b']")).sendKeys("B");
		driver.findElement(By.xpath("//input[@class='c']")).sendKeys("C");
		driver.findElement(By.xpath("//input[@class='d']")).sendKeys("D");
		
		Thread.sleep(2000);
		driver.close();
	}

}
