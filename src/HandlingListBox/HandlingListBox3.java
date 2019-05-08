package HandlingListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingListBox3 {

	static
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	
	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();

	    driver.get("file:///C:/Users/Shekhar/Desktop/HTMLforQspider/ListBox.html");
	    WebElement hotel = driver.findElement(By.id("slv"));
	    Select sel=new Select(hotel);
	    
	    if(sel.isMultiple())
	    {
	    	System.out.println("Multi Select list box");
	    }
	    else
	    {
	    	System.out.println("single select list box");
	    }
driver.close();
	}

}
