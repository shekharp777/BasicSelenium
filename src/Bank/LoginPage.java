package Bank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	//declaration
	private WebElement unTB;
	private WebElement pwTB;
	private WebElement loginBTN;
	
	//initialization
	public void logingPage(WebDriver driver)
	{
		unTB=driver.findElement(By.id("username"));
		pwTB=driver.findElement(By.name("pwd"));
		loginBTN=driver.findElement(By.xpath("//div[.='login']"));
		
	}
	
	//utilization
	public void enterUserName(String un)
	{
		try 
		{
		unTB.sendKeys(un);
		}
		catch(Exception e)
		{
			
		}
	}
	
	public void enterPasswd(String pwd)
	{
		try 
		{
		pwTB.sendKeys(pwd);
	
		}
		catch(Exception e)
		{
			
		}
		
	}
	
	public void clickOnLogin()	
	{
		try 
		{
		
		loginBTN.click();
		}
		catch(Exception e)
		{
			
		}
		
	}

}
