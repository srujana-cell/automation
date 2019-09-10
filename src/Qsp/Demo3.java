package Qsp;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Demo3 
{
	static 
	{
		System.setProperty("webdriver.chrome.driver",  "./Drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		System.setProperty("webdriver.ie.driver", "./Drivers/IEDriverServer.exe");
	}
	public static void main(String[] args) throws InterruptedException 
	{
		System.out.println("enter the browser name");
		
		//taking input from user
		Scanner sc = new Scanner(System.in);
		
		//storing user input
		String browser = sc.nextLine();
		
		WebDriver driver = null;//default values
		
		if (browser.equals("chrome")) 
		{
			driver = new ChromeDriver();
		}
		else if (browser.equals("firefox"))
		{
			driver = new FirefoxDriver(); 
		}
		else if (browser.equals("ie"))
		{
			driver = new InternetExplorerDriver();
		}
		else 
		{
			System.out.println("enter valid browser name");
		}
		Thread.sleep(2000);
		driver.close();
		
	}

}
