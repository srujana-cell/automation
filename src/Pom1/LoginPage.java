package Pom1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LoginPage 
{
	//declaration
	@FindBy(id = "email")
	private WebElement unTB;
	
	@FindBy(id= "pass")
	private WebElement pwTB;
	
	@FindBy(xpath = "//input[@value='Log In']")
	private WebElement lgBT;
	
	
	
	//intialization
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//utilization
	public void usernameBox(String un)
	{
		unTB.sendKeys(un);
	}
	public void passwordBox(String pw)
	{
		pwTB.sendKeys(pw);
	}
	public void clickOnLogin()
	{
		lgBT.click();
	}
	
	
	
	
	
	


	
	
	
	
	
	

}
