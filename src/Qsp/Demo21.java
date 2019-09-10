package Qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo21 
{
	//write a script to copy the text from username A in text field n username b in text field
	static 
    {
		System.setProperty("webdriver.chrome.driver",  "./Drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException
	{
		//launching the chrome browser 
		WebDriver driver = new ChromeDriver();
		
		//enter the url
		driver.get("file:///C:/Users/CHANDRA%20SEKHAR/Desktop/HTML/fist.html");
		
		//get the address of username A textbox
		WebElement un = driver.findElement(By.id("un"));
		
		//get the attribute value of textbox
		String name = un.getAttribute("value");
		
		Thread.sleep(3000);
		
		//paste the value in the username B textbox
		driver.findElement(By.id("un1")).sendKeys(name);
		
		Thread.sleep(3000);
		driver.close();
	}

}