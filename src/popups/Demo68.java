package popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo68 
{
	static 
	{
		System.setProperty("webdriver.chrome.driver",  "./Drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		System.setProperty("webdriver.ie.driver", "./Drivers/IEDriverServer.exe");
	}
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.services.irctc.co.in/homebody.html");
		
		driver.findElement(By.xpath("//input[@class='buttonSubmit']")).click();
		Thread.sleep(2000);
		try 
		{
			//to switch to popup
			Alert a = driver.switchTo().alert();
			System.out.println("popup is displayed");
			//to get the text of errormessage
			String text = a.getText();
			Thread.sleep(2000);
			//to click on ok button
			a.accept();
			lThread.sleep(2000);
			//verifying error popup message
			if (text.equals("Enter Value for  UserName")) 
			{
				System.out.println("pass");
			}
			else 
			{
				System.out.println("fail");
			}
		}
	
		catch(Exception e) 
		{
			System.out.println("popup is not displayed");
		}
		Thread.sleep(2000);
		driver.close();
	}
}
