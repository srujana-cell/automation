package Qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo32 
{
	static 
    {
		System.setProperty("webdriver.chrome.driver",  "./Drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/");
		
		driver.findElement(By.id("username")).sendKeys("admin");
		Thread.sleep(2000);
		
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		try
		{
			wait.until(ExpectedConditions.titleIs("actiTIME - Enter Time-Track"));
			System.out.println("title is matching");
			System.out.println(driver.getTitle());
		} 
		catch (Exception e)
		{
			System.out.println("title is not matching");
			System.out.println(driver.getTitle());
		}
		Thread.sleep(2000);
		
		driver.findElement(By.id("logoutLink")).click();
		
		Thread.sleep(2000);
		driver.close();
	}

}
