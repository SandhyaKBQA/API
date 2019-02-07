package mypackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Practiceteam {

	public static void main(String[] args) throws InterruptedException {
		String key="webdriver.chrome.driver";
		String value="/home/sandhyakb/Downloads/chromedriver";
		System.setProperty(key, value);
		WebDriver driver=new ChromeDriver();
		driver.get("http://testing.onedirectdev117.in");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("charlie.onedirect@gmail.com");
		driver.findElement(By.name("password")).sendKeys("t");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@class='product-image']")).click();
	    Thread.sleep(10000);
	    driver.findElement(By.xpath("//span[@class='sprite settings_new']")).click();
      	Thread.sleep(5000);
      	driver.findElement(By.xpath("(//h3[@class='title profile-text mat-line'])[7]")).click();
      	Thread.sleep(4000);
      	driver.findElement(By.xpath("(//button[@class='od-button small'])[2]")).click();
      	Thread.sleep(2000);
      	driver.findElement(By.cssSelector("input[placeholder='Enter team name']")).sendKeys("team2");
      	driver.findElement(By.cssSelector("textarea[name='description']")).sendKeys("test");
      	Thread.sleep(2000);
        
      	WebElement ele=driver.findElement(By.xpath("(//i[@class='icon-arrow-down'])[1]"));
      	ele.click();    	
        for(int i=2;i<5;i++) 
        {
        	driver.findElement(By.cssSelector(".suggestions-holder li:nth-child("+i+")")).click(); 
        	
         }
        Thread.sleep(5000);
        driver.findElement(By.xpath("(//i[@class='icon-arrow-down'])[1]")).click();
        WebElement ele1=driver.findElement(By.xpath("(//i[@class='icon-arrow-down'])[2]"));  
      	ele1.click();
      	Thread.sleep(5000);
      	for(int j=2;j<5;j++) 
            {
        	driver.findElement(By.cssSelector(".expanded ul > li:nth-child("+j+")")).click(); 
        	
        }
      	Thread.sleep(10000);
      	driver.findElement(By.cssSelector("button[style='margin-right: 14px;']")).click();
      	Thread.sleep(10000);
      	 driver.navigate().to("http://testing.onedirectdev117.in/v2/settings/teams");
      	Thread.sleep(10000);
      	WebElement element=driver.findElement(By.cssSelector("input[placeholder='Search Team']"));
      	element.sendKeys("team2");
    	Thread.sleep(5000);
    	WebElement e1=driver.findElement(By.cssSelector("i[class='icon-edit']"));
    	Actions a=new Actions(driver);
    	a.moveToElement(e1).build().perform();
      	driver.findElement(By.cssSelector("i[class='icon-edit']")).click();
    	Thread.sleep(5000);
    	driver.findElement(By.cssSelector("md-radio-button[value='2']")).click();
    	Thread.sleep(5000);
    	driver.findElement(By.cssSelector("button[style='margin-right: 14px;']")).click();
    	Thread.sleep(5000);
    	WebElement e2=driver.findElement(By.cssSelector("i[class='icon-delete']"));
    	Actions a1=new Actions(driver);
    	a1.moveToElement(e2).build().perform();
      	driver.findElement(By.cssSelector("i[class='icon-delete']")).click();
      	Thread.sleep(5000);
      	driver.findElement(By.xpath("//button[text()=' Yes ']")).click();    	
   

	}

}
