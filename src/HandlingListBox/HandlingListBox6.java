package HandlingListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingListBox6 {


	static
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}


	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/Shekhar/Desktop/HTMLforQspider/ListBox.html");
		WebElement hotel = driver.findElement(By.id("slv"));
		WebElement element = driver.findElement(By.xpath("//option[@value='sp']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		Select sel=new Select(hotel);
	
		List<WebElement> allOptions = sel.getOptions();
		int count = allOptions.size();
		System.out.println(count);
		
		
		for(int i=0;i<count;i++)
		{
			sel.selectByIndex(i);
			WebElement option = allOptions.get(i);
			String text = option.getText();
	
			Thread.sleep(1000);
			System.out.println(text);
			
			if(i<=count)
			{
				Thread.sleep(2000);
				
				js.executeScript("arguments[0].scrollIntoView();", element);
				Thread.sleep(2000);
			}
			
		}
		
		
		Thread.sleep(2000);
		System.out.println("\n\ndeselected options");
		for(int i=0;i<count;i++)
		{
			try 
			{
			sel.deselectByIndex(i);
			}
			catch(Exception e)
			{
				
			}
			WebElement option = allOptions.get(i);
			String text = option.getText();
			Thread.sleep(1000);
			System.out.println(text);
			
			if(i<=count)
			{
				Thread.sleep(2000);
				js.executeScript("arguments[0].scrollIntoView();", element);
				Thread.sleep(2000);
			}
		}
		
		//js.executeScript("arguments[0].scrollIntoView();", element);
		Thread.sleep(1000);
		
driver.close();
	}

}
