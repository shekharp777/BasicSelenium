package QSP;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		String key="webdriver.gecko.driver";
		//String value="D:\\Selenium\\Automation\\drivers\\geckodriver.exe";
		String value="./drivers/geckodriver.exe";
		
		System.setProperty(key,value);
		FirefoxDriver f = new FirefoxDriver();
		Thread.sleep(2000);
		f.close();
		
	}

}
