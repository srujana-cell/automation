package Qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo25 
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
		
		driver.get("file:///C:/Users/CHANDRA%20SEKHAR/Desktop/HTML/second.html");
		
		//get the address of all the linkes
		List<WebElement> alllinkes = driver.findElements(By.xpath("//a"));
		
		//count the no.of linkes
		int count = alllinkes.size();
		System.out.println(count);
		
		//print the linkes
		/*for (int i = 0; i < count; i++) 
		{
			WebElement link = alllinkes.get(i);
			String text = link.getText();
			System.out.println(text);
		}*/
		
		for (WebElement link : alllinkes) 
		{
			String text = link.getText();
			System.out.println(text);
		}
		
		Thread.sleep(4000);
		driver.close();
	}
}
