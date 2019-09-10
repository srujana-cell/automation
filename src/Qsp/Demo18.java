package Qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//write a script to check whether the checkbox is selected r not
public class Demo18 
{
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
    	
    	WebElement ch = driver.findElement(By.id("keepLoggedInLabel"));
    	
    	boolean v = ch.isSelected();
    	
    	if(v)
    	{
    		System.out.println("checkbox is selected");
    	}
    	else
    	{
    		System.out.println("checkbox is not selected");
    	}
    	
    	//ch.click();
    	Thread.sleep(1000);
    	driver.close();
    }

}
