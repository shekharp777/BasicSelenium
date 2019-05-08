package Qspider;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContentsOfTable {

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
		List<WebElement> allCells = driver.findElements(By.xpath("//table[@id='t1']//td"));
		
		int count=allCells.size();
		System.out.println("No of cells:"+count);
		
		System.out.println("contents of cells");
		for(WebElement cell:allCells)
		{
			String text = cell.getText();
			System.out.println(text);
		}
	Thread.sleep(2000);
	driver.close();
	}

}
