package Qsp;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo19 
{
	//write a script to whether the specified element is displayed r not
	static 
	{
		System.setProperty("webdriver.chrome.driver",  "./Drivers/chromedriver.exe");
	}
    public static void main(String[] args) throws InterruptedException
    {
    	//launching the chrome browser 
    	WebDriver driver = new ChromeDriver();
    					
    	//enter the url of application
    	driver.get("http://demo.actitime.com");
    	
    	WebElement link = driver.findElement(By.xpath("(//a)[1]"));
    	
    	boolean v = link.isDisplayed();
    	
    	if(v)
    	{
    		System.out.println("links are displayed");
    	}
    	else 
    	{
    		System.out.println("links are not displayed");
		}
    	
    	Thread.sleep(1000);
    	driver.close();
    }

}
