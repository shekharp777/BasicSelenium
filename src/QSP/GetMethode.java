package QSP;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethode {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
	}


	public static void main(String[] args) throws InterruptedException {

			WebDriver driver=new ChromeDriver();
			driver.get("http://www.google.co.in/");
			Thread.sleep(2000);
			driver.close();
			
	}

}
