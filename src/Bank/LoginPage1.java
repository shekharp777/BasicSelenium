package Bank;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage1 {
	//declaration
	@FindBy(id="username")
	private WebElement unTB;
	
	@FindBy(name="pwd")
	private WebElement pwTB;
	
	@FindBy(xpath="//div[.=['Login ']]")
	private WebElement loginBTN;
	
	
	public LoginPage1(WebDriver driver) {
		// TODO Auto-generated constructor stub
	}

	//initialization
	public void logingPage(WebDriver driver)
	{
	PageFactory.initElements(driver, this);
		
	}
	
	//utilization
	public void enterUserName(String un)
	{
		
		unTB.sendKeys(un);
		
		
	}
	
	public void enterPasswd(String pwd)
	{
		
		pwTB.sendKeys(pwd);
	
		
		
	}
	
	public void clickOnLogin()	
	{
		
		loginBTN.click();
		
		
	}

}
