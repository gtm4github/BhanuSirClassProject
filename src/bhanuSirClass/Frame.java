package bhanuSirClass;

/*
 --> for recognize a FRAME after right click on element -->we get another new option->RELOAD FRAME

eg: Page2.html
     t2:<input type="text" id="t2">

Page1.html
     <iframe id="f1" src="Page2.html"></iframe>
     <br>
     t1:<input type="text" id="t1">

*/



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Kumar%20Gautam/Desktop/Frame/Page1.html");
		// using index
		driver.switchTo().frame(0);
		driver.findElement(By.id("t2")).sendKeys("A");
		driver.switchTo().parentFrame();
		driver.findElement(By.id("t1")).sendKeys("A");
		
		//using id
		driver.switchTo().frame("f1");
		driver.findElement(By.id("t2")).sendKeys("B");
		driver.switchTo().defaultContent();
		driver.findElement(By.id("t1")).sendKeys("B");
		
		//using address
		WebElement e = driver.findElement(By.tagName("iframe"));
		driver.switchTo().frame(e);
		driver.findElement(By.id("t2")).sendKeys("C");
		driver.switchTo().parentFrame();
		driver.findElement(By.id("t1")).sendKeys("C");
		
		
		
	}

}
