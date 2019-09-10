package Qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Demo12 
{
	
	static 
	{
		System.setProperty("webdriver.chrome.driver",  "./Drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		System.setProperty("webdriver.ie.driver", "./Drivers/IEDriverServer.exe");
	}
	public static void main(String[] args) throws InterruptedException 
	{
		FirefoxOptions option = new FirefoxOptions();
	    option.addPreference("dom.disable_beforeunload",true);
		//launching the chrome browser 
		WebDriver driver = new FirefoxDriver(option);
		
		/*ChromeOptions cp = new ChromeOptions();
	    cp.addArguments("--disable-notifications");
	    WebDriver driver = new ChromeDriver(cp);*/
		//maximize the window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("srujana.khagga@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("SUJI@123");
		
		driver.findElement(By.xpath("//span[@class='gb_Ba gbii']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("userNavigationLabel")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Sign out']")).click();
		Thread.sleep(3000);
		driver.close();
	}

}
