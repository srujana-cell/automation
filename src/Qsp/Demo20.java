package Qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo20 
{
	static 
	{
		System.setProperty("webdriver.chrome.driver",  "./Drivers/chromedriver.exe");
	}
    public static void main(String[] args) throws InterruptedException
    {
    	//launching the chrome browser 
    	WebDriver driver = new ChromeDriver();
    	
    	//enter the webpage url
    	driver.get("file:///C:/Users/CHANDRA%20SEKHAR/Desktop/HTML/fist.html");
    	
    	WebElement un = driver.findElement(By.id("un"));
    	
    	boolean v = un.isEnabled();
    	
    	if (v) 
    	{
    		System.out.println("textbox is enabled");
		} 
    	else 
    	{
    		System.out.println("textbox is disabled");
    	}
    	
    	Thread.sleep(1000);
    	driver.close();
    	
    }
    					

}
