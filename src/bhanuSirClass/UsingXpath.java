package bhanuSirClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingXpath {
		static{
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			
		}
		public static void main(String[] args) {
			WebDriver driver = new ChromeDriver();
			driver.get("file:///C:/Users/Kumar%20Gautam/Desktop/gtm.html");
			driver.findElement(By.xpath("/html/body/a")).click();// ABSOLUTE xpath
		}

}
