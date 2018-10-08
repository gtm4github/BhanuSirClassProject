package bhanuSirClass;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popups {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.naukri.com");
// Child Browser Popup
		String parent = driver.getWindowHandle();
		Set<String> allWHS = driver.getWindowHandles();
		for (String wh : allWHS) {
			driver.switchTo().window(wh).close();
		}
		driver.switchTo().window(parent);
// Hidden Division Popup
		driver.findElement(By.xpath("//span[text()='Later']")).click();
// File Upload Popup
		String msg = driver.findElement(By.className("success")).getText();
		System.out.println(msg);
		
	}

}
