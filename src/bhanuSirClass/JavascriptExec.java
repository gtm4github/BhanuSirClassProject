package bhanuSirClass;
//--> write a script to scroll by giving generic X & Y ,donot do hard coding

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExec {
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
	    int y = e.getLocation().getY();
	    System.out.println(y);
	    JavascriptExecutor j=(JavascriptExecutor)driver; // typecasting
	    //j.executeScript("window.scrollBy(0,5947)");
	   j.executeScript("window.scrollBy("+x+","+y+")") ;
	}
}
