package QSP;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
	}


	public static void main(String[] args) throws InterruptedException {

			WebDriver driver=new ChromeDriver();
			driver.navigate().to("http://www.google.co.in/");
			Thread.sleep(4000);
			
			//to refresh the page
			driver.navigate().refresh();
			Thread.sleep(4000);
			
			//to navigate the back page
			driver.navigate().back();
			Thread.sleep(4000);
			
			//to navigate the forward page
			driver.navigate().forward();
			Thread.sleep(4000);
			
			driver.close();
	}

}
