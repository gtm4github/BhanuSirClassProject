package bhanuSirClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IRCTClogin {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args)  {
		WebDriver driver = new ChromeDriver();
		// Enter URL
		driver.get("https://www.irctc.co.in/eticketing/pageUnderConstruction.jsf");
		driver.findElement(By.id("usernameId")).sendKeys("USERNAME");// give username
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("PASSWORD");// give pwd here
	

 }
}
