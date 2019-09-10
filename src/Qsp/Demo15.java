package Qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo15 
{
	//write a script to get the size of an element
	static 
	{
		System.setProperty("webdriver.chrome.driver",  "./Drivers/chromedriver.exe");
	}
	public static void main(String[] args) 
	{
		//launching the chrome browser 
		WebDriver driver = new ChromeDriver();
		
		//enter the url of application
		driver.get("http://demo.actitime.com");
		
		//address of an element
		WebElement un =driver.findElement(By.id("username"));
		
		//get the size of an element
		Dimension d = un.getSize();
		
		int h = d.getHeight();
		int w = d.getWidth();
		
		System.out.println(h +" \t "+w);
		
		driver.close();
	}

}
