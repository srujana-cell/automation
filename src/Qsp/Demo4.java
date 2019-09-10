package Qsp;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo4 
{
	static
	{
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException 
	{
		
		//launching the chrome browser
		WebDriver driver = new ChromeDriver();
	
		//enter the url of application
		driver.get("https://www.google.com/");
	
		//get title of current web page
		String title = driver.getTitle();
		System.out.println(title);
	
		//get url of current application
		String url = driver.getCurrentUrl();
		System.out.println(url);
	
		//get the source code of current web page
		String src = driver.getPageSource();
		System.out.println(src);
		
		Thread.sleep(5000);
		//close the chrome browser
		driver.close();
	
	}
	
}
