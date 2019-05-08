

package HandlingPopUps;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class FileDownloadPopUp1 {
	
	static
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		
		FirefoxProfile profile=new FirefoxProfile();
		
		String key="browser.helperApps.neverAs.SaveToDist";
		String value="application/zip";
		
		profile.setPreference(key, value);
		
		
		WebDriver driver=new FirefoxDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.seleniumhq.org/download/");
		String xp="//td[.='Java']/..//a[.='Download']";
		driver.findElement(By.xpath(xp)).click();
		
		
		
		//Thread.sleep(2000);
		//driver.close();
	}

}
