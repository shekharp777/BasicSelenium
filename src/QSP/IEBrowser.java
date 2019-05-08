package QSP;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		String key="webdriver.ie.driver";
		String value="./drivers/IEDriverServer.exe";
		System.setProperty(key, value);
		InternetExplorerDriver i=new InternetExplorerDriver();
		Thread.sleep(2000);
		i.close();
	}

}
