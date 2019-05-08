package Qspider;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintOnlyNoFromTable {

	static 
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		System.setProperty("webdriver.ie.driver", "./drivers/IEDriverServer.exe");

	}
	
	public static void main(String[] args) throws InterruptedException {

		int count=0, sum=0;
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///D:/HTMLforQspider/Tables.html");
		
		List<WebElement> allCells = driver.findElements(By.xpath("//td"));
		
		for(WebElement cells:allCells)
		{
			String text = cells.getText();
			
			try
			{
				int n=Integer.parseInt(text);
				System.out.println(n);
				
				count++;
				sum=sum+n;
				
			}
			catch(Exception e)
			{
				
			}
			
			System.out.println("No of digits: "+count);
			System.out.println("sum of digits: "+sum);
			
			driver.close();
		}
		
		
	}

}
