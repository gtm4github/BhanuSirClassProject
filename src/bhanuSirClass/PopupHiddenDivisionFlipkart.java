package bhanuSirClass;

//------->    we can handle HIDDEN DIVISION POPUP by using findElement() statement       <--*******

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupHiddenDivisionFlipkart {   //hidden division popup-->colourful,Can inspect it bt,cnnt move it----> eg. CALENDAR
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.flipkart.com");
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("gtm");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//button)[2]")).click();
	

}
}