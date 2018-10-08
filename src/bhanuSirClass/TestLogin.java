package bhanuSirClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLogin {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.actitime.com");
		FBLoginPage login = new FBLoginPage(driver);
		login.setUserName("admin");
		login.setPassword("manager");
		login.clickLogin();
	}

}
