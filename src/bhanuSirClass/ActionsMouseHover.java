package bhanuSirClass;
 /*
 -->Automate the following scenario:-
      step1: open the browser
      step2: goto actitime.com
      step3: place the mouse pointer(hover) on 'Features' menu
      step4: select the first submenu
   
   */
   
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsMouseHover {

	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.actitime.com/");
		//Find the menu
		WebElement menu = driver.findElement(By.linkText("Features"));
		//MouseHover on the menu
		Actions actions = new Actions(driver);//pass argument of specific 'webpage'/'webdriver' on which we need to perform any action
		actions.moveToElement(menu).perform();//pass argument of specific 'webelement' on which we need to perform any action--> perform() is mandatory
		driver.findElement(By.linkText("Simple Time Tracking")).click();
		
		
		
	}

}
