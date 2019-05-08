package HandlingPopUps;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivisionPopUp2 {
	
	static
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://online.actitime.com/xyz42/login.do");
		driver.findElement(By.id("username")).sendKeys("shekhar.pakale");
		driver.findElement(By.name("pwd")).sendKeys("asdf");
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		
		driver.findElement(By.xpath("(//div[@class='img'])[2]")).click();
		
		driver.findElement(By.xpath("(//div[@class='img'])[7]")).click();
		driver.findElement(By.xpath("//span[.='Delete']")).click();
	
		Thread.sleep(2000);
		driver.findElement(By.id("deleteTaskPopup_deleteConfirm_cancelBtn")).click();
		
	//	Thread.sleep(2000);
	//	alert.dismiss();
		
		Thread.sleep(2000);
		driver.close();
	}

}
