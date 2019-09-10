package Qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo34 
{
	//navigate google search qspiders count & print all suggestions click on last suggestion
	static 
    {
		System.setProperty("webdriver.chrome.driver",  "./Drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		
		//enter the text to active element
		driver.switchTo().activeElement().sendKeys("qspiders");
		Thread.sleep(3000);
		
		//get the address of all suggestions
		List<WebElement> allsug = driver.findElements(By.xpath("//div[contains(@class,'A8SBwf emcav')]"));
		
		//to count all suggestions
		int count = allsug.size();
		System.out.println(count);
		
		//to get the text of all sug
		for (int i = 0; i < count; i++)
		{
			WebElement sug = allsug.get(i);
			String text = sug.getText();
			System.out.println(text);
		}
		//click on last suggestion
		Thread.sleep(3000);
		allsug.get(count-1).click();
		Thread.sleep(3000);
		driver.close();
	}

}
