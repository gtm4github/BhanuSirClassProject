package bhanuSirClass;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class PopupNotification {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args) throws AWTException, InterruptedException {
		//ChromeOptions options=new ChromeOptions();
		//options.addArguments("--disable-notifications");
		//options.addArguments("--disable-infobars");
		//options.addArguments("--headless");
		//options.addExtensions("path of new file");
	FirefoxOptions options=new FirefoxOptions();
	options.addArguments("--disable-popup-blocking");
		WebDriver driver=new FirefoxDriver(options);
		
		
		//new ChromeDriver();----------> no arg constructor---> ChromeDriver(),its not a default constructor
		
		//WebDriver driver = new ChromeDriver(options);      
	    driver.get("http:www.yatra.com");
	    //driver.get("http://www.facebook.com");
	}
	

}
