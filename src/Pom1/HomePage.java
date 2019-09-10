package Pom1;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	@FindBy(xpath = "(//a[@class='_2s25'])[1]")
	private WebElement homeBTN;
	
	@FindBy(xpath = "//a[@class='_4-h7 _5qtn']")
	private WebElement composeBTN;
	
	@FindBy(xpath = "//textarea[@class='_3en1 _480e navigationFocus _23pl']")
	private WebElement passingTextBTN;
	
	@FindBy(xpath = "(//div[@class='_3jk'])")
	private WebElement photoBTN;
	
	@FindBy(xpath = "(//div[@class='_3jk'])[1]")
	private WebElement photoUploadBTN;
	
	@FindBy(xpath = "(//div[@class='_2aha'])[2]")
	private WebElement tagFriendBTN;
	
	@FindBy(xpath = "//div[@class='_45wg _69yt']")
	private WebElement shareBTN;
	
	@FindBy(xpath = "//input[@class='_58al'])[1]")
	private WebElement tagFriendBox;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void tagFriendTextBox()
	{
		tagFriendBTN.click();
	}
	public void tagFriendListBox(String text)
	{
		tagFriendBox.sendKeys(text);
		try 
		{
			Thread.sleep(2000);
			Robot r = new Robot();
			int e = KeyEvent.VK_ENTER;
			r.keyPress(e);
			Thread.sleep(1000);
			r.keyRelease(e);
		} 
		catch (Exception e)
		{
			
		}
	}
	public void photoClick(String path)
	{
		try
		{
			photoBTN.click();
			Thread.sleep(2000);
			StringSelection file = new StringSelection(path);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(file, null);
			Robot r = new Robot();
			int c = KeyEvent.VK_CONTROL;
			int v = KeyEvent.VK_V;
			int e = KeyEvent.VK_ENTER;
			r.keyPress(c);
			r.keyPress(v);
			Thread.sleep(1000);
			r.keyRelease(c);
			r.keyRelease(v);
			Thread.sleep(2000);
			r.keyRelease(e);
			Thread.sleep(1000);
			r.keyRelease(e);
		} 
		catch (Exception e)
		{
			
		}
	}
	public void homeButtonClick()
	{
		homeBTN.click();
	}
	public void composeButtonClick()
	{
		composeBTN.click();
	}
	public void shareButtonClick()
	{
		shareBTN.click();
	}
	public void posting()
	{
		passingTextBTN.click();
	}
	
	

}
