package HandlingPopUps;


import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopUp2 {
	
	static
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
	
		Set<String> windHand = driver.getWindowHandles();
		
		int count =windHand.size();
		System.out.println(count);

		for(String wh:windHand)
		{
			driver.switchTo().window(wh);
			String title = driver.getTitle();
			System.out.println(title);
		}
		Thread.sleep(2000);
		driver.quit();

	}

}
