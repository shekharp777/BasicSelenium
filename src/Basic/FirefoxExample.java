package Basic;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxExample {

	public static void main(String[] args) throws InterruptedException {

		String key="webdriver.gecko.driver";
		String value="./drivers/geckodriver.exe";
		
		System.setProperty(key, value);
		
		FirefoxDriver f=new FirefoxDriver();
		Thread.sleep(2000);
		f.close();
	}

}
