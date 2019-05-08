package HandlingPopUps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptPopUps1 {
	
	static
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.irctc.co.in/");
		driver.findElement(By.id("loginbutton")).click();
		
		Alert alert = driver.switchTo().alert();
		
		//To get the text present on Pop Up
		String text = alert.getText();
		System.out.println(text);
		
		Thread.sleep(5000);
		//To click on ok
		alert.accept();
		
		//To click on cancel button
		//alert.dismiss();     //NoAlertPresentException
		
		Thread.sleep(2000);
		driver.close();
	}

}
