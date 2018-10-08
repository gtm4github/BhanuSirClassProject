package bhanuSirClass;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupJavascript {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		// Enter URL
		driver.get("https://www.irctc.co.in/eticketing/pageUnderConstruction.jsf");
		//click login button without UN & PWD
		driver.findElement(By.id("loginbutton")).click();
		//switchto popup,get the msg & click ok
		
		Thread.sleep(2000);
		
		Alert alert = driver.switchTo().alert(); // JAVASCRIPT popup is handle by using this line
		System.out.println(alert.getText());
		//alert.accept();
//		alert.dismiss();
		

}
}