package testpom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class Loginpom {
	
private static WebElement element=null;
Loginpom lp;
	public static WebElement user_Email(WebDriver driver)
		{
	element=driver.findElement(By.xpath("//input[@name='email']"));
	return element;
		}
	public static WebElement user_password(WebDriver driver)
	{
		element=driver.findElement(By.name("password"));
		return element;
	}
	public static WebElement submit_Button(WebDriver driver)
	{
		element=driver.findElement(By.xpath("//button[@type='submit']"));
		return element;
	}
	public Loginpom(WebDriver driver){
		PageFactory.initElements(driver,this);
	}
	
}
