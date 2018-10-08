package bhanuSirClass;
//how to handle the TAB---->window handle is not for the browser,but it is for TABs--->so,to handle child browser and TABs,we will use-->driver.switchTo.window
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsComposite {

	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		WebElement link = driver.findElement(By.linkText("actiTIME Inc."));
		//cntrl + click (its an example of composite action->Multiple actions at a time)
		
		Actions action=new Actions(driver);
		action.sendKeys(Keys.CONTROL).click(link).perform();
		Thread.sleep(2000);
		//in this example getWindowHandles return WindowHandle of all the TABs
		Set<String> allWHS = driver.getWindowHandles();
		System.out.println(allWHS.size());//to count the TABs
		for (String wh : allWHS) {
			driver.switchTo().window(wh);//switch to TAB
			System.out.println(driver.getTitle());
			
			
		}
		driver.close();//close only current TAB
		driver.quit();//close all the TABs
	}
}
