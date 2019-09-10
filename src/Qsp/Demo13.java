package Qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo13 
{
	static 
	{
		System.setProperty("webdriver.chrome.driver",  "./Drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException 
	{
		//launching the chrome browser 
		WebDriver driver = new ChromeDriver();
	
		//maximize the window
		driver.manage().window().maximize();
		
		driver.get("https://mail.google.com/mail/#inbox");
		driver.findElement(By.id("identifierId")).sendKeys("velpurineela79@gmail.com",Keys.ENTER);
	
		//either add keys.enter or write driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("lsvkka@79",Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(@class,'gb_Ba gbii')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Sign out')]")).click();
	
		
		driver.close();
	}


}
