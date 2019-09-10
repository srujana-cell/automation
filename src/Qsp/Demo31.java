package Qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo31 
{
	static 
    {
		System.setProperty("webdriver.chrome.driver",  "./Drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/");
		
		driver.findElement(By.id("username")).sendKeys("admin");
		Thread.sleep(2000);
		
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		driver.findElement(By.id("logoutLink")).click();
		Thread.sleep(2000);
		driver.close();
	}

}
