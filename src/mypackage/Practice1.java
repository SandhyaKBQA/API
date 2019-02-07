package mypackage;

import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1 {

	
	public static void main(String[] args) {
		String key="webdriver.chrome.driver";
		String value="/home/sandhyakb/Downloads/chromedriver";
		System.setProperty(key, value);
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://sites.google.com/a/chromium.org/chromedriver/downloads");
		String title=driver.getTitle();
		System.out.println(title);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		driver.quit();
		
		
		
	}

}