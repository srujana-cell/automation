package Pom1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Demo
{
	static 
	{
		System.setProperty("webdriver.chrome.driver",  "./Drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		System.setProperty("webdriver.ie.driver", "./Drivers/IEDriverServer.exe");
	}
	public static void main(String[] args) throws IOException, InterruptedException
	{
		ChromeOptions cp = new ChromeOptions();
	    cp.addArguments("--disable-notifications");
	    
	   /* FirefoxOptions option = new FirefoxOptions();
	    option.addPreference("dom.disable_beforeunload", true);
	    WebDriver driver = new FirefoxDriver(option);*/
	    
		/*Properties p = new Properties();
		File f = new File("./Demo.properties");
		FileInputStream file = new FileInputStream(f);
		p.load(file);
		System.out.println(p.getProperty("un"));
		System.out.println(p.getProperty("pw"));*/
		
	    WebDriver driver = new ChromeDriver(cp);
	    driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
		LoginPage lp = new LoginPage(driver);
		HomePage hp = new HomePage(driver);
		
		lp.usernameBox("srujana.khagga@gmail.com");
		lp.passwordBox("SUJI@123");
		lp.clickOnLogin();
		hp.homeButtonClick();
		hp.composeButtonClick();
		
		Thread.sleep(3000);
		hp.photoClick("C:\\Users\\CHANDRA SEKHAR\\Desktop\\photos\\IMG-20190720-WA0001.jpg");
		hp.tagFriendTextBox();
		hp.tagFriendListBox("Chandra Sekhar");
		hp.shareButtonClick();
		Thread.sleep(2000);
		driver.close();
		
		
		
	}
}
