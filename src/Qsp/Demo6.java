package Qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo6 
{
	static
	{
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException 
	{
		//launching the chrome browser 
		WebDriver driver = new ChromeDriver();
		
		//delete the cookies
		driver.manage().deleteAllCookies();
		
		//enter the url of application
		driver.get("https://www.google.com/");
		
		//switch to active element
		driver.switchTo().activeElement().sendKeys("selenium");
		
		Thread.sleep(3000);
		//close the browser
		driver.close();
		
		
		
		
	}

}
