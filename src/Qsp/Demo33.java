package Qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo33 
{
	//generic method to verify the titles
	static 
    {
		System.setProperty("webdriver.chrome.driver",  "./Drivers/chromedriver.exe");
	}
	public static void verifyTitle(WebDriver driver,String title) 
	{
		WebDriverWait wait = new WebDriverWait(driver,10);
		try 
		{
			wait.until(ExpectedConditions.titleIs(title));
			System.out.println("title is matching");
			System.out.println(title);
		} 
		catch (Exception e) 
		{
			System.out.println("title is matching");
			System.out.println(driver.getTitle());
		}
	}
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/");
		verifyTitle(driver,"actiTIME - Login ");
		
		driver.findElement(By.id("username")).sendKeys("admin");
		Thread.sleep(2000);
		
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(2000);
		
		verifyTitle(driver,"actiTIME - Enter Time-Track");
		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
		
		Thread.sleep(2000);
		driver.close();
	}
}
