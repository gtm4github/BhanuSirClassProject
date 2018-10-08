package bhanuSirClass;
// ****    --> write a script to scroll to the specific element  ***

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecScroll {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
	    driver.get("https://www.actitime.com/license-agreement");
	    
	    String xp="//h2[text()='15. Miscellaneous']";
	    WebElement e = driver.findElement(By.xpath(xp));
	    
	    int x = e.getLocation().getX();
	    System.out.println(x);
	    
	    int y = e.getLocation().getY();
	    System.out.println(y);
	    
	    WebElement h = driver.findElement(By.cssSelector("header.header"));//1st header is TAG,2nd one is CLASS,(.)=CLASS
	    int height = h.getSize().getHeight();
	    System.out.println(height);
	    y=y-height;//-->to minus the height of header height
	    
	    JavascriptExecutor j=(JavascriptExecutor)driver;
	    j.executeScript("window.scrollTo("+x+","+y+")");// ---> goto console of html sourcecode and type--> window.
	}
}
//scrollBy--> is used to scroll from the current position till the given x y coordinate
//scrollTo---> is used to scroll from top {irrespective of the current position} to given x y coordinate