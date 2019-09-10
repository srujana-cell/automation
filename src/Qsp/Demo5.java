package Qsp;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo5 
{
static
{
System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException 
	{
		//launching the chrome browser
		WebDriver driver = new ChromeDriver();
		
		//set of the size of window 
		Dimension d = new Dimension(150,170);
		
		driver.manage().window().setSize(d);
		Thread.sleep(3000);
		
		//set the position of the window
		Point p = new Point(100,200);
		
		driver.manage().window().setPosition(p);
		Thread.sleep(3000);
		
		//maximize the window
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//fullscreen of window
		driver.manage().window().fullscreen();
		
		Thread.sleep(3000);
		driver.close();
		
	}

}
