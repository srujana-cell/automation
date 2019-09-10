package Pom2;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import Pom1.LoginPage;

public class Demo extends LoginPage
{
	static 
	{
		System.setProperty("webdriver.chrome.driver",  "./Drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		System.setProperty("webdriver.ie.driver", "./Drivers/IEDriverServer.exe");
	}
	public static void main(String[] args) throws IOException, InterruptedException
	{
		/*ChromeOptions cp = new ChromeOptions();
	    cp.addArguments("--disable-notifications");*/
	    
	    FirefoxOptions option = new FirefoxOptions();
	    option.addPreference("dom.disable_beforeunload", true);
	    WebDriver driver = new FirefoxDriver(option);
	    driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		LoginPage lp = new LoginPage(driver);
		
		lp.firstName();
		Thread.sleep(1000);
		lp.lastName("kumar");
		Thread.sleep(1000);
		lp.emailName("srujana.khagga@gmail.com");
		Thread.sleep(1000);
		lp.newPassword("SUJI@123");
		Thread.sleep(1000);
		lp.selectGender("f");
		Thread.sleep(1000);
		
		lp.selectDay("8", null, null);
		lp.selectMonth(null,"9",null);
		lp.selectYear(null,null,"2019");
		Thread.sleep(1000);
		
		Thread.sleep(3000);
		
	}
}
