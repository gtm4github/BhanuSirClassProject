package bhanuSirClass;
//      ---> open html sourcecode goto CONSOLE and type --> window.

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecScrollBasic {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
	    driver.get("https://www.actitime.com/license-agreement");
	    JavascriptExecutor j=(JavascriptExecutor)driver; // typecasting
	   
	    for (int i = 1; i <= 10; i++) {
			j.executeScript("window.scrollBy(0,500)");  //-->(x,y)  x= horizontally scroll,y=vertically scroll---> +500-->top to bottom
	    	Thread.sleep(500);
		}
	    for (int i = 1; i <= 10; i++) {
	    	j.executeScript("window.scrollBy(0,-500)");//--> -500-->bottom to top
	    	Thread.sleep(500);
			
		}
	    
	    
	}
}
