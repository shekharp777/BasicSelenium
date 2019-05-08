package ActionsClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementMethod2 {
	
	static
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.DAYS);
		
		driver.get("http://www.istqb.in/");
		
		String xp1="//span[.='FOUNDATION']";
		WebElement foundation = driver.findElement(By.xpath(xp1));
		
		String xp2="//span[.='ENROLLMENT']";
		WebElement enrollment = driver.findElement(By.xpath(xp2));
		
		String xp3="//span[.='CORPORATE ENROLLMENT']";
		WebElement corEnrollment = driver.findElement(By.xpath(xp3));
		
		String xp4="//span[.='ONLINE ENROLLMENT']";
		WebElement onEnrollment = driver.findElement(By.xpath(xp4));
		
		Actions act=new Actions(driver);
		
		Thread.sleep(1000);
		act.moveToElement(foundation).perform();
		
		Thread.sleep(1000);
		act.moveToElement(enrollment).perform();
		
		Thread.sleep(1000);

		act.moveToElement(corEnrollment).click().perform();
		
		Thread.sleep(2000);
		onEnrollment.click();
		
		//driver.close();
		
	}

}
