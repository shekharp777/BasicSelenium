package Synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitlyWaitMethod {
	static
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}


	public static void main(String[] args)
	{
		    WebDriver driver=new ChromeDriver();
		    driver.manage().window().maximize();
		//    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		    driver.get("https://accounts.google.com/ServiceLogin");
			 			 
		    driver.findElement(By.xpath("//input[@type='email']")).sendKeys("shekhar.pakale@gmail.com");
			driver.findElement(By.xpath("//span[.='Next']")).click();
			
			
			driver.findElement(By.name("password")).sendKeys("asdflkjh9886724411*");	
			driver.findElement(By.xpath("//span[.='Next']")).click();
			
			driver.findElement(By.xpath("//span[@class='gb_7a gbii']")).click();
			driver.findElement(By.xpath("//a[.='Sign out']")).click();
			
			String title = driver.getTitle();
			System.out.println(title);
			
			String eTitle="Sign in - Google Accounts";
			WebDriverWait wait = new WebDriverWait(driver,20);
			
			try 
			{
				wait.until(ExpectedConditions.titleIs(eTitle));
				System.out.println("Pass............");
				
			}
			catch(Exception e)
			{
				System.out.println("fail.........");
			}
		finally
		{
			driver.close();
		}
	}


}

