package Bank;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {
	
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
		
		LoginPage lp=new LoginPage();
		
		Thread.sleep(2000);
		lp.enterUserName("shekhar.pakale");
		lp.enterPasswd("asdf");
		lp.clickOnLogin();
		
	}

}
