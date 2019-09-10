package Qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo40 
{
	static 
	{
		System.setProperty("webdriver.chrome.driver",  "./Drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		System.setProperty("webdriver.ie.driver", "./Drivers/IEDriverServer.exe");
	}
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/CHANDRA%20SEKHAR/Desktop/HTML/fifth.html");
		
		//get the address of list box
		WebElement menu = driver.findElement(By.id("hotel"));
		
		//creating the object of select & passing listbox address
		Select sel = new Select(menu);
		sel.selectByIndex(2);
		Thread.sleep(2000);
		
		sel.selectByIndex(4);
		
		//to get the first selected option
		WebElement opt = sel.getFirstSelectedOption();
		
		String text = opt.getText();
		System.out.println(text);
		
		Thread.sleep(2000);
		driver.close();
	}

}
