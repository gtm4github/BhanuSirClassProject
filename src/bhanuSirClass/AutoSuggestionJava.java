package bhanuSirClass;
/*
  step1:open the browser
  step2:goto google.com
  step3:type 'java' in the search box
  step4:find all the autosuggestion and print the count,text and select 4th one
*/

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestionJava {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://www.google.com");
		driver.findElement(By.id("lst-ib")).sendKeys("java");

		String xp = "//div[contains(text(),'java')]";// --> String xp="//div[@class='sbqs_c']";
		
		List<WebElement> allAS = driver.findElements(By.xpath(xp));
		int count = allAS.size();
		System.out.println("Total no. of AUTOSUGGESTION is--> " + count);

		for (WebElement e : allAS) {
			System.out.println(e.getText());
		}
		allAS.get(3).click();

	}

}
