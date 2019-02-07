package mypackage;
import org.openqa.selenium.chrome.*;


public class New {

	public static void main(String[] args) {
		String key="webdriver.chrome.driver";
			String value="/home/sandhyakb/Downloads/chromedriver";
			System.setProperty(key, value);
			ChromeDriver Driver=new ChromeDriver();
			Driver.quit();
			
			
		

	}

}
