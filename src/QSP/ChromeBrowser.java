package QSP;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {

	public static void main(String[] args) throws InterruptedException 
	{
		String key="webdriver.chrome.driver";
		String value="./drivers/chromedriver.exe";
		System.setProperty(key, value);
		ChromeDriver c =new ChromeDriver();
		Thread.sleep(2000);
		c.close();

	}

}
