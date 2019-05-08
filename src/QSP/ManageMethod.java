package QSP;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageMethod {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
	}


	public static void main(String[] args) throws InterruptedException {

			WebDriver driver=new ChromeDriver();
			
			Thread.sleep(2000);
			//to set the size of window
			Dimension d =new Dimension(300,300);
			driver.manage().window().setSize(d );
			
			Thread.sleep(2000);
			//to set the position of window
			Point p =new Point(450,350);
			driver.manage().window().setPosition(p );
			
			Thread.sleep(2000);
			//to maximize the window
			driver.manage().window().maximize();
			
			Thread.sleep(2000);
			driver.close();
	}

}
