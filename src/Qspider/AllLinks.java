package Qspider;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLinks {
	
	static 
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		System.setProperty("webdriver.ie.driver", "./drivers/IEDriverServer.exe");

	}


	public static void main(String[] args) throws InterruptedException {

		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.seleniumhq.org/download/");
		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		
		int count=allLinks.size();
		System.out.println(count);
		
		for(int i=0;i<count;i++)
		{
			WebElement link = allLinks.get(i);
			String linkText = link.getText();
			
			System.out.println(linkText);
		}
		
		Thread.sleep(2000);
		driver.close();
	}

}
