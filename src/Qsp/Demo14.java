package Qsp;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo14 
{
	static 
	{
		System.setProperty("webdriver.chrome.driver",  "./Drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		System.setProperty("webdriver.ie.driver", "./Drivers/IEDriverServer.exe");
	}
	public static void main(String[] args) throws IOException, InterruptedException 
	{
		//launching the chrome browser 
		WebDriver driver = new ChromeDriver();
		
		//enter the url of application
		driver.get("http://commons.apache.org/proper/commons-io/download_io.cgi");
		
		//creating reference for takescreenshot(I) we r doing casting for takescreenshot(I) n webdriver(I)
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("./demo.png");
		
		FileUtils.copyFile(src, dest);
		
		Thread.sleep(4000);
		
		driver.close();
		
	}

}
