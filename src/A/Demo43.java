package A;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Demo43 
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
		
		//to get all the options address 
		List<WebElement> allopt = sel.getOptions();
		
		//creating object of arraylist
		ArrayList<String> al = new ArrayList<String>();
		for (WebElement opt : allopt) 
		{
			//to get the options from listbox
			String text = opt.getText();
			
			//to add the text to arraylist
			al.add(text);
		}
		//to sort the arraylist
		Collections.sort(al);
		for (String a : al) 
		{
			System.out.println(a);
		}
		driver.close();
	}
}



