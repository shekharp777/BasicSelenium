package QSP;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleElement14 {
	static
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}


	public static void main(String[] args) throws InterruptedException
	{
		int count=0, sum=0;
		    WebDriver driver=new ChromeDriver();
			driver.get("file:///C:/Users/Shekhar/Desktop/HTMLforQspider/Tables.html");
			 
			List<WebElement> allcells = driver.findElements(By.xpath("//td"));
			
			for(WebElement cells:allcells)
			{
				String text = cells.getText();
				
				try
				{
					int n = Integer.parseInt(text);
					System.out.println(n);
					count++;
					sum=sum+n;
				}
				catch(Exception e)
				{
					
				}
				
				
			}
			
			System.out.println("No of digits="+count);
			System.out.println("sum of digits="+sum);
		driver.close();
	}



}
