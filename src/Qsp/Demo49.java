package Qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo49 
{
	static 
	{
		System.setProperty("webdriver.chrome.driver",  "./Drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		System.setProperty("webdriver.ie.driver", "./Drivers/IEDriverServer.exe");
	}
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://home.redbrickhealth.com/");
		
		String xp = "//a[contains(text(),'RedBrick Health')]/parent::div/parent::nav//a[@title='Solutions']";
		
		WebElement menu = driver.findElement(By.xpath(xp));
		
		//to perform mouse& keyboard actions
		Actions act = new Actions(driver);
		
		//to move the cursor
		act.moveToElement(menu).perform();
		List<WebElement> allsub = driver.findElements(By.xpath("(//a[@class='nav-link dropdown-toggle'])[1]"));
		
		//to count
		int count = allsub.size();
		System.out.println(count);
		
		//to print
		for (int i = 0; i < count; i++) 
		{
			WebElement sub = allsub.get(i);
			String text = sub.getText();
			System.out.println(text);
		}
		Thread.sleep(3000);
		//to click last submenu
		allsub.get(count-1).click();
		Thread.sleep(4000);
		driver.close();
		
	}
}
