package bhanuSirClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Gmail {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.gmail.com");
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("01k.gautam@gmail.com");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		
		//Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//input[@type='password']")).sendKeys("@@@@01@@");
		driver.findElement(By.name("password")).sendKeys("@@@@01@@");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		
		
	

    }
}
