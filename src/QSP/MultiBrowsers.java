package QSP;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class MultiBrowsers {
	
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		System.setProperty("webdriver.ie.driver", "./drivers/IEDriverServer.exe");
		
	}

	public static void main(String[] args) throws InterruptedException {

	System.out.println("Enter the Browser Name: ");
	Scanner sc=new Scanner(System.in);
	String browser = sc.nextLine();
	
	WebDriver driver=null;

	
	if(browser.equals("gc"))
	{
		driver=new ChromeDriver();
	}
	
	else if(browser.equals("ff"))
	{
		driver=new FirefoxDriver();
		
	}
	else if(browser.equals("ie"))
	{
		driver=new InternetExplorerDriver();
	}
	


	Thread.sleep(2000);
	driver.close();
}
}