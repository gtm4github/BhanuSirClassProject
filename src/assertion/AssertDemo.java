package assertion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertDemo {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	@Test
	public void testLogin() {
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.actitime.com");
		String aTitle = driver.getTitle();
		String eTitle = "actiTIME - Login";
		Assert.assertEquals(aTitle, eTitle);//--->when comparison fails,it will not execute remaining statements of current methods
		driver.close();// it will not close the browser,when comparison fails
	}

}
