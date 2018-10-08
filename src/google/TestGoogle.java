package google;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestGoogle {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		SearchPage s = new SearchPage(driver);
		s.printLinkCount();
		
		
	}

}
