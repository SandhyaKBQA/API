package mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Practice2 {
	//String s1="charlie.onedirect@gmail.com";

	
	public static void main(String[] args) throws InterruptedException {
		String key="webdriver.chrome.driver";
		String value="/home/sandhyakb/Downloads/chromedriver";
		System.setProperty(key, value);
		WebDriver driver=new ChromeDriver();
		driver.get("http://testing.onedirectdev215.in");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("charlie.onedirect@gmail.com");
		driver.findElement(By.name("password")).sendKeys("t");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@class='product-image']")).click();
	    Thread.sleep(4000);
	    driver.get("http://testing.onedirectdev215.in/brandfull#/settingsKeywordsTab");
//		driver.findElement(By.xpath("//span[@class='sprite settings_new']")).click();
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("(//h3[@class='title profile-text mat-line'])[15]")).click();
//		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='add']")).sendKeys("UI");
		driver.findElement(By.xpath("//button[@class='btn btn-primary border_25']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@ng-model='searchText']")).sendKeys("UI");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//i[@class='fa fa-pencil rules-edit-icon']")).click();
		driver.findElement(By.xpath("//input[@value='UI']")).sendKeys("1");
		driver.findElement(By.xpath("//i[@alt='Save']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//i[@alt='Delete'])[1]")).click();
		
		
		
		
		
		
		
		
		
	

	}

}
