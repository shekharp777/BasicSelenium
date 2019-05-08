package Qspider;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoOfRowsInTable {
	
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
		List<WebElement> totalNoOfRows = driver.findElements(By.xpath("//table[@id='t1']//tr"));
		
		List<WebElement> totalNoOfColumn = driver.findElements(By.xpath("//table[@id='t1']//tr[1]//td"));
		
		int count=totalNoOfRows.size();
		System.out.println("total no of rows:" +count);
		
		int count1=totalNoOfColumn.size();
		System.out.println("total no of column:" +count1);
		
		Thread.sleep(2000);
		driver.close();
		
	}

}
