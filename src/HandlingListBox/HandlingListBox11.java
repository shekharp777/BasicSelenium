package HandlingListBox;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingListBox11 {


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
			
		
		List<WebElement> allOptions = sel.getOptions();
		HashSet<String> allText=new HashSet<String>();
		
		System.out.println("\n\nduplicate ListBox");
		for(WebElement option:allOptions)
		{
			
			String text = option.getText();
			if(!allText.add(text))
			{
				System.out.println(text);
		
			}
		}	
		
		
driver.close();
	}

}
