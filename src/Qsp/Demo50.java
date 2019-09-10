package Qsp;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.GetScreenOrientation;

public class Demo50 
{
	static 
	{
		System.setProperty("webdriver.chrome.driver",  "./Drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		System.setProperty("webdriver.ie.driver", "./Drivers/IEDriverServer.exe");
	}
	public static void getscreenshot(WebDriver driver,String name) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("./RedBrickHealth.png"));
	}
	public static void main(String[] args) throws InterruptedException, IOException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://home.redbrickhealth.com/");
		
		String xp = "//a[contains(text(),'RedBrick Health')]/parent::div/parent::nav//a[@title='Results']";
		
		WebElement menu = driver.findElement(By.xpath(xp));
		
		//to perform mouse& keyboard actions
		Actions act = new Actions(driver);
		
		//to move the cursor
		act.moveToElement(menu).perform();
		List<WebElement> allsub = driver.findElements(By.xpath("(//a[contains(@class,'nav-link')]"));
	
		
		//to count
		int count = allsub.size();
		System.out.println(count);
		//to print
		for (int i = 0; i < count; i++) 
		{
			WebElement sub = allsub.get(i);
			String text = sub.getText();
			System.out.println(text);
		}
		Thread.sleep(3000);
		allsub.get(count-2).click();
		Thread.sleep(3000);
		getscreenshot(driver, "Research");
		System.out.println("screenshot is taken");
		
		driver.close();
	}
}
