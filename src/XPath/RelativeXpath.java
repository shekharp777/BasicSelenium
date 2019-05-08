package XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpath {
	
	static
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		System.setProperty("webdriver.ie.driver", "./drivers/IEDriverServer.exe");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/Shekhar/Desktop/HTML/SamplePage.html");
		
		driver.findElement(By.xpath("//div[1]/input[1]")).sendKeys("65");
		driver.findElement(By.xpath("//div[1]/input[2]")).sendKeys("66");
		driver.findElement(By.xpath("//div[2]/input[1]")).sendKeys("67");
		driver.findElement(By.xpath("//div[2]/input[2]")).sendKeys("68");
		
		Thread.sleep(2000);
		driver.close();
		

	}

}
