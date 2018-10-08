package bhanuSirClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PopupPrint {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver = new ChromeDriver();//------->
		//WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		Robot r =new Robot();
		r.keyPress(KeyEvent.VK_CONTROL );//KeyEvent is a class frm JAVA
		r.keyPress(KeyEvent.VK_P);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		//press esc to cancel the POPUP
		//r.keyPress(KeyEvent.VK_ESCAPE);
		//r.keyPress(KeyEvent.VK_RIGHT);
		driver.findElement(By.xpath("(//button[text()='Cancel'])[2]")).click();
		//r.keyPress(KeyEvent.VK_ENTER);
	}


}
