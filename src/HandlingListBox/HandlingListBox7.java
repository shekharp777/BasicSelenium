package HandlingListBox;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingListBox7 {


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
		ArrayList<String> allText=new ArrayList<String>();
		
		for(WebElement option:allOptions)
		{
			
			String text = option.getText();
			allText.add(text);
			System.out.println(text);
		}
		
		Collections.sort(allText);
		
		System.out.println("\n\nSorted order");
		for(String text:allText)
		{
			System.out.println(text);
		}
		
driver.close();
	}

}
