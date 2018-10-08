package bhanuSirClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameDragnDropDemo {

	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		
		//driver.switchTo().frame(0);----> this line of code is mandatory to perform any action on any element,which is inside the FRAME
		
		WebElement source=driver.findElement(By.xpath("//p[text()='Drag me to my target']"));
		WebElement target= driver.findElement(By.xpath("//p[text()='Drop here']"));
		
		Actions action=new Actions(driver);
		action.dragAndDrop(source, target).perform();
	}
}
