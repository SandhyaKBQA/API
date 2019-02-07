package testpom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginscript {

	 @FindBy(xpath="//input[@name='email']")
	 private WebElement email;
	 
		
	@FindBy(name="password")
	private WebElement psw;
	
	@FindBy(xpath="//button[@type='submit']")
	 private WebElement submit;
	
	@FindBy(xpath="//img[@class='product-image']")
	private WebElement service;
	
	public Loginscript(WebDriver driver)
	{
	PageFactory.initElements(driver, this);
	}
 public void setusername(String mail)
  {
email.sendKeys(mail);

  }
  public void setpassword(String paswrd)
  {
	psw.sendKeys(paswrd);
  }
  public void clicksubmit()
  {
	  submit.click();
  }
  public void clickservice()
  {
	  service.click();
  }
  
} 
  
  
  
  
