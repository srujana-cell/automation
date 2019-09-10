package Qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo10 
{
	//write a script to verify the title of webpage
	static 
	{
		System.setProperty("webdriver.chrome.driver",  "./Drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException 
	{
		//launching the chrome browser 
		WebDriver driver = new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//enter the url of application
		driver.get("https://www.facebook.com/");
		
		String atitle = driver.getTitle();
		
		String etitle = "https://www.facebook.com/login";
		
		if (atitle.equals(etitle)) 
		{
			System.out.println("title is matching");
		}
		else 
		{
			System.out.println("title is not matching");
		}
		
		Thread.sleep(2000);
		driver.close();
		
	}

}
