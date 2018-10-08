package bhanuSirClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarOnHealth {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://retail.starhealth.in/renewal");
		driver.findElement(By.id("nqame2")).sendKeys("P12345");
		driver.findElement(By.id("dtDOB")).click();
		//driver.findElement(By.linkText("15"))
		
		//select current date
		driver.findElement(By.cssSelector("li.currentdate>a")).click();
		driver.findElement(By.id("proceed")).click();


}
}