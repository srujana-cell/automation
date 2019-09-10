package Qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo44 
{
	static 
    {
		System.setProperty("webdriver.chrome.driver",  "./Drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//get the address of list box
		WebElement da = driver.findElement(By.id("day"));
		Select sel = new Select(da);
		sel.selectByValue("2");
		Thread.sleep(2000);
		
		WebElement mon = driver.findElement(By.id("month"));
		Select sel1 = new Select(mon);
		sel.selectByVisibleText("Aug");
		Thread.sleep(2000);
		
		WebElement yr = driver.findElement(By.id("year"));
		Select sel2 = new Select(yr);
		sel.selectByValue("1991");
		
		Thread.sleep(2000);
		driver.close();
	}

}
