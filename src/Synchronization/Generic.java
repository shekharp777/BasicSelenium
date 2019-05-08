package Synchronization;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Generic {

	public static void verifyTitle(WebDriver driver, String eTitle)
	{
		WebDriverWait wait=new WebDriverWait(driver,10);
		try 
		{
			wait.until(ExpectedConditions.titleIs(eTitle));
			System.out.println("Pass............");
			
		}
		catch(Exception e)
		{
			System.out.println("fail.........");
		}
	driver.close();
		
	}

}
