package Qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo11 
{
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
		driver.get("file:///C:/Users/CHANDRA%20SEKHAR/Desktop/HTML/.html");
	
		Thread.sleep(2000);
		
		//by using id
		driver.findElement(By.id("gm")).click();
		driver.navigate().back();
		
		//by using name
		driver.findElement(By.name("gml")).click();
		driver.navigate().back();
			
		//by using className
		driver.findElement(By.className("gmail")).click();
		driver.navigate().back();
		
		//by using tagName
		driver.findElement(By.tagName("a")).click();
		driver.navigate().back();
				
		//by using linkText
		driver.findElement(By.linkText("Facebook")).click();
		driver.navigate().back();
				
		//by using partialLinkText
		driver.findElement(By.partialLinkText("ceb")).click();
		
		Thread.sleep(2000);
		
		driver.close();
				
		
	}

}
