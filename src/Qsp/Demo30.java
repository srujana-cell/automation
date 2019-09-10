package Qsp;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo30 
{
	static 
    {
		System.setProperty("webdriver.chrome.driver",  "./Drivers/chromedriver.exe");
	}
	public static void getScreenshot(WebDriver driver,String name)
	{
		//creating reference for takesscreenshot(I) we r doing casting for this (I) & WebDriver(I)
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("C:\\Users\\CHANDRA SEKHAR\\Desktop\\screenshots"+name+"./demo.png");
		
		
		try
		{
			FileUtils.copyFile(src, dest);
		} 
		catch (IOException e)
		{
		}
	}
	public static void main(String[] args) throws InterruptedException 
	{
		//launching the chrome browser 
		WebDriver driver = new ChromeDriver();
				
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		getScreenshot(driver, "google");
		
		driver.get("https://github.com/");
		getScreenshot(driver, "github");
		
		driver.get("https://www.seleniumhq.org/download/");
		getScreenshot(driver, "selenium");
		
		driver.get("https://demo.actitime.com/login.do");
		getScreenshot(driver, "actitime");
		
		driver.close();
	}

}
