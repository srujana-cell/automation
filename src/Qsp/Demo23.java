package Qsp;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Demo23 
{
	static 
    {
		System.setProperty("webdriver.chrome.driver",  "./Drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException
	{
		//launching the chrome browser 
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		//creating reference for takesscreenshot(I) we r doing casting for this (I) & WebDriver(I)
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("./demo.png");
		
		
		try
		{
			FileUtils.copyFile(src, dest);
		} 
		catch (IOException e)
		{
		}
		Thread.sleep(4000);
		driver.close();
	}
}
