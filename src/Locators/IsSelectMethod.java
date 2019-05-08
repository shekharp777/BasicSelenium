package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IsSelectMethod {
	static
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}


	public static void main(String[] args)
	{
		
		     WebDriver driver=new ChromeDriver();
			
			 driver.get("file:///C:/Users/Shekhar/Desktop/HTMLforQspider/CheckBox.html");
			 driver.manage().window().maximize();
			WebElement cb = driver.findElement(By.name("vehicle"));
			//cb.click();
			boolean s = cb.isSelected();
			
			if(s)
			{
				System.out.println("selected");
			}
			else
			{
				System.out.println("not selected");	
			}
			
		driver.close();
	}

}

