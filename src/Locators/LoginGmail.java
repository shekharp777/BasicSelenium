package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginGmail {
	static
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
	}


	public static void main(String[] args) throws InterruptedException {
		
			//WebDriver driver=new FirefoxDriver();
		
			WebDriver driver=new ChromeDriver();
			//driver.get("file:///C:/Users/Shekhar/Desktop/HTMLforQspider/LoginPage.html");
			
			driver.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=AddSession");
			
	
			
			driver.findElement(By.id("identifierId")).sendKeys("shekhar.pakale@gmail.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[.='Next']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf']")).sendKeys("asdflkjh9886724411*");	
			driver.findElement(By.xpath("//span[.='Next']")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//span[@class='gb_7a gbii']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[.='Sign out']")).click();
			
			driver.close();
	}

}
