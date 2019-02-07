package BasePackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	public WebDriver driver=null;
	
	@BeforeMethod
	public void beforeMethod()throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "/home/sandhyakb/Downloads/chromedriver");
		this.driver=new ChromeDriver();
		this.driver.manage().window().maximize();
		this.driver.manage().deleteAllCookies();
		this.driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		this.driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		this.driver.get("http://testing.onedirectdev215.in");		
		
	}
	
	@AfterMethod
	public void afterMethod()throws Exception
	{
		driver.quit();
	}
	
	

}
