package Qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo9 
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
		
		driver.get("https://demo.actitime.com/");
		
		String eurl = "https://demo.actitime.com/login.do";
		
		String aurl = driver.getCurrentUrl();
		
		if (aurl.equals(eurl)) 
		{
			System.out.println("pass");
		}
		else 
		{
			System.out.println("fail");
		}
		Thread.sleep(3000);
		driver.close();
	}

}
