package Qspider;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoOfCellsInTable1 {
	
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
		List<WebElement> totalNoOfCells = element.findElements(By.tagName("td"));
		
		int count=totalNoOfCells.size();
		System.out.println(count);
		
		Thread.sleep(2000);
		driver.close();
	}

}
