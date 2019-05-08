package LoginPage;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebokLoginPage {
	
	static 
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		System.setProperty("webdriver.ie.driver", "./drivers/IEDriverServer.exe");

	}

	public static void main(String[] args) throws InterruptedException {

		System.out.println("Enter the UserName: ");
		Scanner sc=new Scanner(System.in);
		String un=sc.nextLine();
		
		System.out.println("Enter the password: ");
		String pwd=sc.nextLine();
		
		WebDriver driver=new FirefoxDriver();
		//driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys(un);
		driver.findElement(By.name("pass")).sendKeys(pwd);
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.id("userNavigationLabel")).click();
		
		
		
	}

}
