package Qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo8 
{
	static
	{
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException
	{
		//launching the chrome browser 
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//enter the url
		driver.get("https://www.naukri.com/");
		
		Thread.sleep(3000);
		
		//close the browser
		driver.close();
		
	}

}
