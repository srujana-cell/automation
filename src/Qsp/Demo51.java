package Qsp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo51 
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
		driver.get("http://home.redbrickhealth.com/");
		
	//	String xp = "//a[contains(text(),'RedBrick Health')]/parent::div/parent::nav//a[@title='About Us']";
		
		WebElement menu = driver.findElement(By.xpath("//a[contains(text(),'RedBrick Health')]/parent::div/parent::nav//a[@title='About Us']"));
		
		//to perform mouse& keyboard actions
		Actions act = new Actions(driver);
		
		//to move the cursor
		act.moveToElement(menu).perform();
		List<WebElement> allsub = driver.findElements(By.xpath("(//ul[@class=' dropdown-menu'])[3]//a"));
		
		int count = allsub.size();
		System.out.println(count);
		ArrayList<String> al = new ArrayList<String>();
		
		for (int i = 0; i < count; i++) 
		{
			WebElement sub = allsub.get(i);
			String text = sub.getText();
			//System.out.println(text);
			al.add(text);
		}
		Collections.sort(al);
		for (String a : al) 
		{
			
			System.out.println(a);
		}
		driver.close();
	}
}
