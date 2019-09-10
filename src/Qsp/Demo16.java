package Qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo16 
{
	//write a script to get the location of an specified element
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
		
		//location of an element
		Point p = un.getLocation();
		
		int x = p.getX();
		int y = p.getY();
		
		System.out.println(x+" \t "+y);
		
		driver.close();
	}

}
