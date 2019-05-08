package Synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ImplicitlyWaitMethod {
	static
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
	}


	public static void main(String[] args)  {
		
			//WebDriver driver=new FirefoxDriver();
		
			WebDriver driver=new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.manage().window().maximize();
			
			driver.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=AddSession");
			
			driver.findElement(By.xpath("//input[@type='email']")).sendKeys("shekhar.pakale@gmail.com");
			driver.findElement(By.xpath("//span[.='Next']")).click();
			
			driver.findElement(By.xpath("//input[@aria-label = 'Enter your password']")).sendKeys("asdflkjh9886724411*");	
			driver.findElement(By.xpath("//span[.='Next']")).click();
			
			driver.findElement(By.xpath("//span[@class='gb_7a gbii']")).click();
			driver.findElement(By.xpath("//a[.='Sign out']")).click();
			
			
			driver.close();
	}

}
