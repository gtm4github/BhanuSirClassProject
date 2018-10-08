package fb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestFbPom {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.get("http://www.facebook.com");
		
		FbPomLogin login = new FbPomLogin(driver);
		login.setUserName("enter valid username");
		login.setPassword("enter valid password");
		login.clickLogin();
		
		FbPomHomePage logout = new FbPomHomePage(driver);
		logout.clickDropDown();
		Thread.sleep(5000);
		logout.clickLogout();
	}

}
