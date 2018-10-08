package bhanuSirClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}
	public static void main(String[] args) throws InterruptedException { // InterruptedException comes bcz of 'Thread'
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Kumar%20Gautam/Desktop/gtm.html");
		//WebElement e = driver.findElement(By.tagName("b"));
		//e.click();
		
		driver.findElement(By.tagName("a")).click();// code optimization, 'tagName' locator is a FASTEST locator
		//in the browser finding element 'By' using Tagname 'a' and clicking 
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.findElement(By.id("a1")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.findElement(By.name("n1")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.findElement(By.className("c1")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Google")).click();// can be used only if there is 'link' as well as 'text' also
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.findElement(By.partialLinkText("Goo")).click();//we use it when we have 'text' which is partially changing
		Thread.sleep(1000);
		driver.navigate().back();
		driver.findElement(By.cssSelector("a[id='a1']")).click();
		
		
/*		'cssSelector' doesn't supports 'text'
		'xpath' is the slowest locators
		
		
		
		
		abstract method is always non static
		concrete method may have static as well as non static methods
		*/
	}

}
