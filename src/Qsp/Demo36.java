package Qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo36 
{
	static 
	{
		System.setProperty("webdriver.chrome.driver",  "./Drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		System.setProperty("webdriver.ie.driver", "./Drivers/IEDriverServer.exe");
	}
	Lic static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		
		//enter the text to active element
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
		
		//get the address of all sug
		WebElement allsug = driver.findElement((By.xpath("//div[@id='suggestions-template']"));
		
		//to count all suggestions
		int count = allsug.size();
		
		//to get the text of all sug
		for (int i = 0; i < args.length; i++) 
		{
			WebElement sug = allsug.get(i);
			String text = sug.getText();
			System.out.println(text);
		}
		Thread.sleep(3000);
		driver.close();
	}


}
