package bhanuSirClass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaSel {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
		driver.findElement(By.id("lst-ib")).sendKeys("java");
		Thread.sleep(5000);
		List<WebElement> allElemnts = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		System.out.println(allElemnts.size());
		Thread.sleep(5000);
		allElemnts.get(4).click();
		
		/*
//		driver.findElement(By.xpath("//input[@name='btnK']"));  //----> xpath-->"//input[@value='Google Search']"
		//List<WebElement> allElmnts = driver.findElements(By.xpath("//div[contains(text(),'java')]"));
		
		
		for (WebElement e : allElmnts) {
			String text = e.getText();
			System.out.println(text);
			
		//}
*/	}
	

}
