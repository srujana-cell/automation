package Qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 
{
	public static void main(String[] args) throws InterruptedException 
	{
				String key = "webdriver.chrome.driver";
				String value = "./Drivers/chromedriver.exe";
				
				//set the property of firefoxbrowser
				System.setProperty(key, value);
				
				//launching chrome browser 
				ChromeDriver c = new ChromeDriver();
				Thread.sleep(5000);
				
				//closing chrome browser
				c.close();
				
		
	}

}
