package bhanuSirClass;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDragNDrop {

	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
		WebElement source = driver.findElement(By.xpath("//h1[.='Block 1']"));//.(dot)--> class in cssSelector, .(dot)--->text() in xpath
		WebElement target = driver.findElement(By.xpath("//h1[.='Block 3']"));
		
		Actions actions=new Actions(driver);
		actions.dragAndDrop(source, target).perform();
		
		/*
   -->Uses of Actions Class
		 1. Mouse Hover
		 2. Composite Action
		 3. Double Click
		 4. Drag & drop
		
		*/
	}
}
