package ActionsClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CompositeAction {
	
	static
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException, AWTException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.DAYS);
		
		driver.get("http://actitime.jmr.co.za/actitime/login.do");
		//driver.get("http://jqueryui.com/droppable/");
		WebElement link = driver.findElement(By.xpath("//a[@class='copyright']"));
		
		Actions act=new Actions(driver);
		
		act.sendKeys(Keys.CONTROL).click(link).perform();
		
		Thread.sleep(2000);
		driver.close();
		
	}

}
