package Basic;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserExample {

	static 
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		System.setProperty("webdriver.ie.driver", "./drivers/IEDriverServer.exe");

	}
	
	public static void main(String[] args) throws InterruptedException {

		System.out.println("Enter the browser name: ");
		Scanner sc=new Scanner(System.in);
		String browser=sc.nextLine();
		
		WebDriver driver=null;
		
		if(browser.equals("ff"))
		{
			driver=new FirefoxDriver();
		}
		else if(browser.equals("ch"))
		{
			driver=new ChromeDriver();
			driver.manage().window().maximize();
		}
		else if(browser.equals("ie"))
		{
			driver=new InternetExplorerDriver();
		}
		else
		{
			System.out.println("Invalid browser");
			System.exit(0);
		}
		
		Thread.sleep(2000);
		driver.close();
		
	}

}
