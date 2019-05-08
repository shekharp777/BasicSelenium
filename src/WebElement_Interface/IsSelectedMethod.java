package WebElement_Interface;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedMethod {
	
	static 
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		System.setProperty("webdriver.ie.driver", "./drivers/IEDriverServer.exe");

	}

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/Shekhar/Desktop/HTMLforQspider/CheckBox.html");
		
		WebElement cb = driver.findElement(By.name("vehicle1"));
		boolean s = cb.isSelected();
		
		if(s)
		{
			System.out.println("selected");
		}
		else
		{
			System.out.println("not selected");
			cb.click();
		}
		
		Thread.sleep(2000);
		driver.close();
		
	}

}
