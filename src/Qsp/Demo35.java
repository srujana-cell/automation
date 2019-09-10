package Qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo35 
{
	static 
    {
		System.setProperty("webdriver.chrome.driver",  "./Drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		//enter the text to active element
		driver.switchTo().activeElement().sendKeys("qspiders");
		
		//get the address of all suggestions
		List<WebElement> allsug = driver.findElements(By.xpath("//div[contains(@class,'A8SBwf emcav')]"));
		
		//to count all suggestions
		int count = allsug.size();
		
		//to get the text of all sug
		for (int i = 0; i < count; i++)
		{
			WebElement sug = allsug.get(i);
			String text = sug.getText();
			//click on qspiders hebbal
			if (text.contentEquals("qspiders hebbal")) 
			{
				sug.click();
				break;
			}
		}
		Thread.sleep(3000);
		driver.close();
	}

}
