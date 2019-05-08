package Basic;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class Demo {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("Welcome to Selenium");
		
		String key="webdriver.ie.driver";
		String value="./drivers/IEDriverServer.exe";
		
		System.setProperty(key, value);
		
		InternetExplorerDriver ie=new InternetExplorerDriver();
		Thread.sleep(2000);
		ie.close();
	}

}
