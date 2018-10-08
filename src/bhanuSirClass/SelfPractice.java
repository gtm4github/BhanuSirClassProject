package bhanuSirClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.ui.Select;

public class SelfPractice {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args) throws AWTException, InterruptedException {
		//WebDriver driver = new ChromeDriver();
		/*driver.get("http://www.facebook.com");
		WebElement elmnt = driver.findElement(By.id("month"));
		Select select=new Select(elmnt);
		List<WebElement> allOptions = select.getOptions();
		System.out.println(allOptions);
		*/
		//System.out.println(elmnt);

	}

}
