package HandlingListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingListBox4 {


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
		
		sel.selectByIndex(0);
		sel.selectByIndex(1);
		sel.selectByIndex(2);
		
		
		List<WebElement> allOptions = sel.getAllSelectedOptions();
		int count = allOptions.size();
		System.out.println(count);
		
		
		for(WebElement option:allOptions)
		{
			//WebElement option = allOptions.get(i);
			String text = option.getText();
			System.out.println(text);
		}
		
		
driver.close();
	}

}
