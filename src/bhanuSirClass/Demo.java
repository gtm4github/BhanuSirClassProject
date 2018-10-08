package bhanuSirClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Demo {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-infobars");
		WebDriver driver = new ChromeDriver(options);
		driver.get("http://www.google.com");
		
	}

}
