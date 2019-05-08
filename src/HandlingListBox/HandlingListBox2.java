package HandlingListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingListBox2 {
	
	static
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}


	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();

	    driver.get("file:///C:/Users/Shekhar/Desktop/HTMLforQspider/ListBox.html");
	    WebElement hotel = driver.findElement(By.id("slv"));
	    WebElement element = driver.findElement(By.xpath("//option[@value='p']"));
	    Select sel=new Select(hotel);
	    
	    //Select By Index
	    Thread.sleep(2000);
	    sel.selectByIndex(1);
	    
	    //Select By Value
	    Thread.sleep(2000);
	    sel.selectByValue("v");
	    
	    //Select By Text
	    Thread.sleep(2000);
	    sel.selectByVisibleText("Poori");
	    
	    
	    
	    Thread.sleep(2000);
	    JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
	    
		//Deselect by index
		Thread.sleep(2000);
	    sel.deselectByIndex(1);
	    
	    //Deselect by value
	    Thread.sleep(2000);
	    sel.deselectByValue("v");
	    
	    //Deselect by text
	    Thread.sleep(2000);
	    sel.deselectByVisibleText("Poori");
	    
	    
	    //Deselect all
	    Thread.sleep(2000);
	    //sel.deselectAll();
	    
	    js.executeScript("arguments[0].scrollIntoView();", element);
	    Thread.sleep(2000);
	    
driver.close();
	}

}
