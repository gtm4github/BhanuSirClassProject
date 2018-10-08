package assertion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Both {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
	}
	@Test
	public void testLogin1() {
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.actitime.com");
		
		String aTitle = driver.getTitle();
		String eTitle ="actiTIME - Login";
		
		SoftAssert s=new SoftAssert();//---> methods present in 'SoftAssert' are non-static-->so,we need to create an object f this class
		s.assertEquals(aTitle, eTitle);
		driver.close();
		s.assertAll();//Don't write any statement after this
	}
	@Test
	public void testLogin2() {
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.actitime.com");
		String aTitle = driver.getTitle();
		Assert.assertEquals(aTitle, "invalid");//---> methods present in 'Assert' are static-->so,we needn't to create an object f this class
		driver.close();
		
	}

}
