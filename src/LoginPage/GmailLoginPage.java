package LoginPage;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailLoginPage {
	
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
		
		System.out.println("Enter the Password: ");
		String pwd=sc.nextLine();
		
		
		WebDriver driver=new FirefoxDriver();
		//driver.manage().window().maximize();
		
		driver.get("https://mail.google.com");
		driver.findElement(By.id("identifierId")).sendKeys("un");
		driver.findElement(By.xpath("//span[.='Next']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("pwd*");
		driver.findElement(By.xpath("//span[.='Next']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='gb_ab gbii']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='Sign out']")).click();
		
		Thread.sleep(2000);
		driver.close();
		
	}

}
