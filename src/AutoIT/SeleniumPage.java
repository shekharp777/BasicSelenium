package AutoIT;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumPage {
	

	static
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.seleniumhq.org/download/");
		driver.findElement(By.xpath("//a[contains(.,'3.6.0')]")).click();
		
		Thread.sleep(2000);
		Runtime.getRuntime().exec("C:\\Users\\Shekhar\\Desktop\\SeleniumPage.exe");
		
		Thread.sleep(2000);
		driver.close();
	}

}
