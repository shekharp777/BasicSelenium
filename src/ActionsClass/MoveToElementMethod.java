package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementMethod {
	
	static
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.actimind.com/");
		
		String xp1="//span[.='About Company']";
		WebElement aboutCompany = driver.findElement(By.xpath(xp1));
		
		String xp2="(//a[.='Basic Facts'])[1]";
		WebElement basicFacts = driver.findElement(By.xpath(xp2));
		
		
		Actions act=new Actions(driver);
		act.moveToElement(aboutCompany).perform();
		basicFacts.click();
		
		
	}

}
