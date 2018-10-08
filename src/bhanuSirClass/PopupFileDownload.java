package bhanuSirClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class PopupFileDownload {
	static{
		//System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args) throws AWTException, InterruptedException {
		//WebDriver driver = new ChromeDriver();------->
		
//****** file download in FIREFOX browser----> using ROBOT class   *******	
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.seleniumhq.org/download");
		driver.findElement(By.xpath("//td[text()='Java']/../td[4]/a")).click();//--->OR--->driver.findElement(By.xpath("//td[text()='Java']/following-sibling::td[3]")).click();
		Robot r=new Robot();// class from JAVA,used when selenium code is not working
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_DOWN);//VK--> virtual key
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_ENTER);
		
		
		
		
//****** file download in FIREFOX browser----> using FirefoxProfile class and FirefoxOptions class   *******		
				/*FirefoxOptions options = new FirefoxOptions();
				WebDriver driver = new FirefoxDriver(options);
				driver.get("http://www.seleniumhq.org/download");
				driver.findElement(By.xpath("//td[text()='Java']/following-sibling::td[3]")).click();
				
				FirefoxProfile profile = new FirefoxProfile();
				options.setProfile(profile);
				String key="browser.helperApps.neverAsk.saveToDisk";
				String value="application/zip";
				profile.setPreference(key, value);
				*/
		
		
	
	}

}
