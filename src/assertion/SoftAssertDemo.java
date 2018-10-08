package assertion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertDemo {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	@Test
	public void testLogin() {
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.actitime.com");
		
		String aTitle = driver.getTitle();
		String eTitle = "actiTIME - Login";
		
		SoftAssert s = new SoftAssert();//--->in SofAssert class all methods are non-static,so in order to call all those methods we need to create an object of SoftAssert class 
		s.assertEquals(aTitle, eTitle);
		driver.close();
		s.assertAll();
	}

}
