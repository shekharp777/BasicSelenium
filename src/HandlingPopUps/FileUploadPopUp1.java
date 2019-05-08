package HandlingPopUps;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopUp1 {
	
	static
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.actitime.com/support.php");
	//driver.findElement(By.xpath("//span[.='Support']")).click();
		
		String path="C://Users//Shekhar//Desktop//sample.txt";
		driver.findElement(By.name("screenshot")).sendKeys(path);
		
		
		//Thread.sleep(2000);
		//driver.close();
	}

}
