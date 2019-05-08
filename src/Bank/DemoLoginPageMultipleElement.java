package Bank;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoLoginPageMultipleElement {
	
	
	static
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}


	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("http:..www.seleniumhq.org/");
		LoginPageMultipleElement lpm=new LoginPageMultipleElement();
		lpm.getLinks();
		
	}

}
