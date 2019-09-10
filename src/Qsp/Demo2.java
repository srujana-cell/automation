package Qsp;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class Demo2 
{
	public static void main(String[] args) throws InterruptedException 
	{
				
				//set the property of ie browser
				System.setProperty("webdriver.ie.driver", "./Drivers/IEDriverServer.exe");
				
				//launching ie browser 
				InternetExplorerDriver ie = new InternetExplorerDriver();
				ie.manage().window().maximize();
				Thread.sleep(5000);
				
				//closing ie browser
				ie.close();
				
		
	}

}
