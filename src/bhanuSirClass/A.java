package bhanuSirClass;
//we import the fully classified class name-->bcz...it is in different package

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class A {
	static{
		
//		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");//relative path--> .(dot)-->current project
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver;// to see the source code,we need to declare any class/interface-->then we get fully qualified class name
	
		
		JavascriptExecutor js;// we r declaring these interfaces,to use its references for getting all its methods
		
		TakesScreenshot ts;
		//ts.getScreenshotAs( );
		WebElement e;
		//e..args..
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		ChromeDriver driver=new ChromeDriver();
		
		/*FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://www.google.com");
		driver.close();
		*/

	}

}
