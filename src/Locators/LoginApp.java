package Locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginApp {
	static
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
	}


	public static void main(String[] args) throws InterruptedException {
		
			WebDriver driver=new ChromeDriver();
			//WebDriver driver=new FirefoxDriver();
			
			driver.get("http://www.facebook.com");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
		//By i = By.cssSelector("input[type='password']");
		//WebElement un = driver.findElement(i);
		//un.sendKeys("Rakesh");
		
			//shortcut method
			driver.findElement(By.name("email")).sendKeys("8892730477");
			driver.findElement(By.name("pass")).sendKeys("asdf*1480");	
			driver.findElement(By.id("loginbutton")).click();
			driver.findElement(By.id("userNavigationLabel")).click();
			driver.findElement(By.xpath("(//span[@class='_54nh'])[9]")).click();
		
			driver.findElement(By.name("email")).clear();
			driver.findElement(By.name("pass")).clear();
			
			driver.close();
	}


}
