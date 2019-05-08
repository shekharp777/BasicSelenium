package XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteXpath {
	
	static
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		System.setProperty("webdriver.ie.driver", "./drivers/IEDriverServer.exe");
	}
	

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver =new ChromeDriver();
		
		driver.get("file:///C:/Users/Shekhar/Desktop/HTML/LoginPage.html");
		driver.findElement(By.xpath("/html/body/input[1]")).sendKeys("Shekhar");
		driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("pass123");
		driver.findElement(By.xpath("/html/body/input[3]")).click();
		
		Thread.sleep(2000);
		driver.close();
	}

}
