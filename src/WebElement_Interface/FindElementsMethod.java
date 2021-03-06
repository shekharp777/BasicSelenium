package WebElement_Interface;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsMethod {

	static 
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		System.setProperty("webdriver.ie.driver", "./drivers/IEDriverServer.exe");

	}
	
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/Shekhar/Desktop/HTML/LoginPage.html");
		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		
		int count=allLinks.size();
		System.out.println(count);
		
		for(int i=0;i<count;i++)
		{
			WebElement link = allLinks.get(i);
			String text = link.getText();
			
			System.out.println(text);
		}
	
		Thread.sleep(2000);
		driver.close();
		
	}

}
