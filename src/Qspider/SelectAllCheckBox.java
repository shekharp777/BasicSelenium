package Qspider;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectAllCheckBox {

	static 
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		System.setProperty("webdriver.ie.driver", "./drivers/IEDriverServer.exe");

	}
	
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///D:/HTMLforQspider/CheckBox.html");
		List<WebElement> allCB = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		int count=allCB.size();
		System.out.println(count);
		
		for(WebElement CB:allCB)
		{
		  CB.click();
		  Thread.sleep(2000);
		  
		}
		
		Thread.sleep(2000);
		driver.close();
		
	}

}
