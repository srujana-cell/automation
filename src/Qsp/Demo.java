package Qsp;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo 
{
	public static void main(String[] args) throws InterruptedException 
	{
		String key = "webdriver.gecko.driver";
		//String value = "C:\\Users\\CHANDRA SEKHAR\\Desktop\\selenium\\geckodriver-v0.24.0-win64\\IEDriverServer_x64_3.14.0\\IEDriverServer.exe";
		//String value = "C:/Users/CHANDRA SEKHAR/Desktop/selenium/geckodriver-v0.24.0-win64/IEDriverServer_x64_3.14.0/IEDriverServer.exe";
		String value = "./Drivers/geckodriver.exe";
		
		//set the property of firefoxbrowser
		System.setProperty(key, value);
		
		//launching firefox browser 
		FirefoxDriver f = new FirefoxDriver();
		Thread.sleep(5000);
		
		//closing firefox browser
		f.close();
		
		
	}

}
