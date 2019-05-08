package Qspider;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoOfRowsInTable1 {

	static 
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		System.setProperty("webdriver.ie.driver", "./drivers/IEDriverServer.exe");

	}
	
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///D:/HTMLforQspider/Tables.html");
		WebElement element = driver.findElement(By.id("t1"));
		List<WebElement> a = element.findElements(By.tagName("tr"));
		
		int count=a.size();
		System.out.println("No of rows in table1: "+count);		
		
		
		WebElement elementC = driver.findElement(By.tagName("tr"));
		List<WebElement> b = elementC.findElements(By.tagName("td"));
		
		int countC=b.size();
		System.out.println("No of column in table1: "+countC);

		Thread.sleep(2000);
		driver.close();
		
	}

}
