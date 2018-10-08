package bhanuSirClass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ClearTrip1 {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.cleartrip.com/");
		driver.findElement(By.id("FromTag")).sendKeys("bang");
		driver.findElement(By.xpath("//a[contains(text(),'Kempegowda')]")).click();
		driver.findElement(By.id("ToTag")).sendKeys("goa");
		driver.findElement(By.xpath("//a[contains(text(),'Dabolim')]")).click();
		driver.findElement(By.xpath("//a[contains(@class,'highlight')]")).click();
		driver.findElement(By.id("SearchBtn")).click();
		List<WebElement> allPrices = driver.findElements(By.xpath("//th[@class='price']"));
		for (WebElement price : allPrices) {
			String text = price.getText();
			System.out.println("Original Text--> "+text);
			
		}
	}

}
