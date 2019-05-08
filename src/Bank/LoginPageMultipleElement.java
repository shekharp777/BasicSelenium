package Bank;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageMultipleElement {
	
	//declaration
	@FindBy(xpath="//a")
	private List<WebElement>allLink;
	
	
	//Initialization
	public void loginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	

	//utilization
	public void getLinks()
	{
		try
		{
		int count=allLink.size();
		System.out.println(count);
		for(WebElement link:allLink)
		{
			System.out.println(link.getText());
		}
		}
		catch(Exception e)
		{}
		
		
	}
}
