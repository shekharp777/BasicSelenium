package HandlingPopUps;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivisionPopUps1 {
	
	static
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		
		Date date=new Date();
		SimpleDateFormat s1=new SimpleDateFormat("d");
		SimpleDateFormat s2=new SimpleDateFormat("MMMM");
		String day = s1.format(date);
		String month = s2.format(date);
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.cleartrip.com/");
		driver.findElement(By.id("DepartDate")).click();
		String xp="//span[.='"+month+"']/../../..//a[.='"+day+"']";
		driver.findElement(By.xpath(xp)).click();
		
		Thread.sleep(2000);
		driver.close();
		
	}

}
