package fb;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestFBLogin {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
		FBLoginPage login = new FBLoginPage(driver);
		login.setUserName("valid username");
		login.setPassword("valid pwd");
		login.clickLogin();
		
		FBLogoutPage1 logoutPage1 = new FBLogoutPage1(driver);
		logoutPage1.clickDropdown();

		FBLogoutPage2 logout = new FBLogoutPage2(driver); //err
		logout.logOut();
		
	}

}
