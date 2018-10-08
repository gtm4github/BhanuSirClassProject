package assertion;

//   Assertion--> comparing actual value with expected value is called as Assertion,also called as 'CHECKPOINT'

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertionUsingIfElse {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	@Test
	public void testLogin() {
	
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.actitime.com");
		String acualTitle = driver.getTitle();

		String expectedTitle="actiTIME - login";
		if(acualTitle.equals(expectedTitle)) {
			Reporter.log("PASS",true);
		}else
		{
			Reporter.log("FAIL",true);//------> we can use this also--> Assert.fail();
		}
		driver.close();

	}

}
