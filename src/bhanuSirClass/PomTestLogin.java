package bhanuSirClass;
//eg for StaleElementReferenceException-----> findele---refresh---try to perform action---to overcome use POM--java design pattern

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PomTestLogin {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.actitime.com");

		PomLoginPage login = new PomLoginPage(driver);//--->it is together with PomLoginPage class
		login.setUserName("abc");
		login.setPassword("xyz");
		login.clickLogin();
		Thread.sleep(5000);
		login.setUserName("admin");
		login.setPassword("manager");
		login.clickLogin();
	}

}
