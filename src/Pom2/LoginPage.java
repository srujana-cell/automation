package Pom2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LoginPage 
{
	@FindBy(xpath = "//input[@name='firstname']")
	private WebElement fnTB;
	
	@FindBy(xpath = "//input[@name='lastname']")
	private WebElement lnTB;
	
	@FindBy(xpath = "//input[@name='reg_email__']")
	private WebElement emTB;
	
	@FindBy(xpath = "//input[@name='reg_passwd__']")
	private WebElement npwdTB;
	
	@FindBy(id = "day")
	private WebElement day;
	
	@FindBy(id = "month")
	private WebElement month;
	
	@FindBy(id = "year")
	private WebElement year;
	
	@FindBy(xpath = "//input[@value='1']")
	private WebElement fRBT;
	
	@FindBy(xpath = "//input[@value='2']")
	private WebElement mRBT;
	
	@FindBy(xpath = "//input[@value='-1']")
	private WebElement cRBT;
	
	@FindBy(xpath = "(//button[text()='Sign Up'])[1]")
	private WebElement sBT;
	
	@FindBy(xpath = "((//div[@class='_3jk'])[1]")
	private WebElement photoBT;
	
	//intialization
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	
	public void firstName(String fn)
	{
		fnTB.sendKeys(fn);
	}
	public void lastName(String ln)
	{
		lnTB.sendKeys(ln);
	}
	public void emailName(String em)
	{
		emTB.sendKeys(em);
	}
	public void newPassword(String npwd)
	{
		npwdTB.sendKeys(npwd);
	}
	
	public void femaleRadio(String f)
	{
		fRBT.sendKeys(f);
	}
	public void maleRadio(String m)
	{
		mRBT.sendKeys(m);
	}
	public void customRadio(String c)
	{
		cRBT.sendKeys(c);
	}
	public void signUp(String s)
	{
		
		sBT.sendKeys(s);
	}
	
	
		//utilization
		public void selectDay(int n,String value,String text)
		{
			if (n>=1)
			{
				Select sel = new Select(day);
				sel.selectByIndex(n);
			}
			else if(value.equals(value))
			{
				Select sel = new Select(day);
				sel.selectByValue(value);
			}
			else if(text.equals(text))
			{
				Select sel = new Select(day);
				sel.selectByVisibleText(text);
			}
		}
		public void selectMonth(int n,String value,String text)
		{
			if (n>=1)
			{
				Select sel = new Select(month);
				sel.selectByIndex(n);
			}
			else if(value.equals(value))
			{
				Select sel = new Select(month);
				sel.selectByValue(value);
			}
			else if(text.equals(text))
			{
				Select sel = new Select(month);
				sel.selectByVisibleText(text);
			}
		}
		public void selectYear(int n,String value,String text)
		{
			if (n>=1)
			{
				Select sel = new Select(year);
				sel.selectByIndex(n);
			}
			else if(value.equals(value))
			{
				Select sel = new Select(year);
				sel.selectByValue(value);
			}
			else if(text.equals(text))
			{
				Select sel = new Select(year);
				sel.selectByVisibleText(text);
			}
		}
		public void selectGender(String text)
		{
			if (text.equals("f"))
			{
				fRBT.click();
			}
			else if(text.equals("m"))
			{
				mRBT.click();
			}
			else if(text.equals("c"))
			{
				cRBT.click();
			}
		}
		public void signUp()
		{
			sBT.click();
		}
		

}
