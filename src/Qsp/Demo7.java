package Qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo7 
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
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		
		//enter the url
		driver.navigate().to("https://www.google.com/");
		Thread.sleep(3000);
		
		//go to privacies webpage
		driver.navigate().back();
		Thread.sleep(3000);
		
		//go to next webpage
		driver.navigate().forward();
		Thread.sleep(3000);
		
		//refresh the webpage
		driver.navigate().refresh();
		Thread.sleep(3000);
		
		//close the browser
		driver.close();
		
	}

}
