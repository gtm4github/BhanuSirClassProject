package bhanuSirClass;

/*
--> Automate the following scenario:-
     step1: open the browser
     step2: goto demo.actitime.com
     step3: right click(context click) on actitime link and select open link in new TAB
*/

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
//move to element used with only dropdown menu
//right click---opening in new tab

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsContextClick {

	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/");
		WebElement link = driver.findElement(By.linkText("actiTIME Inc."));
		//cntrl + click (its an example of composite action-?Multiple actions at a time)
		
		Actions action=new Actions(driver);
		action.contextClick(link).perform();//we cannt inspect the context menu--->so use ROBOT class
		Thread.sleep(2000);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_T);//T=new tab---W=new window
		
	
	}
}
