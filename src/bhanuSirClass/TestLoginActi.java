package bhanuSirClass;
//eg for StaleElementReferenceExcepton----->when???--> findelement---refresh---and then try to perform action on that element
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLoginActi {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.actitime.com");

		LoginPage login = new LoginPage(driver);//---> see class LoginPage
		login.setUserName("abc");
		login.setPassword("xyz");
		login.clickLogin();
		//Thread.sleep(2000);
		login.setUserName("admin");
		login.setPassword("manager");
		login.clickLogin();
	}

}
