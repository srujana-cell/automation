package Qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo17 
{
	//write a script to check username n password textbox both will have the same size r not
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
    	
    	//get the address of username textbox
    	WebElement un =driver.findElement(By.id("username"));
    	
    	//get the address of password textbox
    	WebElement pw = driver.findElement(By.name("pwd"));
    	
    	//get the size of username textbox
    	Dimension und = un.getSize();
    	
    	int unh = und.getHeight();
    	int unw = und.getWidth();
    	
    	//get the size of password textbox
    	Dimension pwd = pw.getSize();
    	
    	int pwh = pwd.getHeight();
    	int pww = pwd.getWidth();
    	
    	//compare the size of username n password textboxes
    	if(unh == pwh && unw == pww)
    	{
    		System.out.println("same size");
    	}
    	else 
    	{
    		System.out.println("different size");
    	}
    	
    	Thread.sleep(2000);
    	driver.close();
    }

}
