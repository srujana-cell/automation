package Qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo27 
{
	static 
    {
		System.setProperty("webdriver.chrome.driver",  "./Drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException
	{
		//launching the chrome browser 
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/CHANDRA%20SEKHAR/Desktop/HTML/third.html");
		
		List<WebElement> allch = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		int count = allch.size();
		System.out.println(count);
		
		for (int i = count-1; i >=0; i--) 
		{
			WebElement ch = allch.get(i);
			ch.click();
			Thread.sleep(1000);
		}
		
		Thread.sleep(4000);
		driver.close();
	}

}
