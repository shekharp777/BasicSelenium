package HandlingListBox;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingListBox1 {
	
	static
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}


	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    
	    driver.get("file:///C:/Users/Shekhar/Desktop/HTMLforQspider/ListBox.html");
	    WebElement hotel = driver.findElement(By.id("slv"));
	    WebElement element = driver.findElement(By.xpath("//option[@value='p']"));
	    Select sel=new Select(hotel);
	    
	    //By Index
	   // Thread.sleep(2000);
	    sel.selectByIndex(1);
	    
	    //By Value
	    Thread.sleep(2000);
	    sel.selectByValue("v");
	    
	    //By Text
	   
	    //Thread.sleep(3000);
	    sel.selectByVisibleText("Poori");
	    
	    //Thread.sleep(4000);
	    JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
	    
		 Thread.sleep(3000);
	    driver.close();

	}

}
