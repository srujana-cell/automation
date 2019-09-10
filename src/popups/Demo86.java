package popups;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo86
{
	static 
	{
		System.setProperty("webdriver.chrome.driver",  "./Drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		System.setProperty("webdriver.ie.driver", "./Drivers/IEDriverServer.exe");
	}
	public static void main(String[] args) throws IOException, InterruptedException 
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/CHANDRA%20SEKHAR/Desktop/HTML/six.html");
		Thread.sleep(2000);
		WebElement tables = driver.findElement(By.cssSelector("body"));
		List<WebElement> allcells = tables.findElements(By.tagName("tr"));
		int count = allcells.size();
		System.out.println(count);
		for (WebElement cell : allcells) 
		{
			String text = cell.getText();
			System.out.println(text);
		}
		driver.close();
		
	}

}
