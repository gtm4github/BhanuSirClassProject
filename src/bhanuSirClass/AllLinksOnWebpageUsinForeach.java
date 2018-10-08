package bhanuSirClass;


// program to print all links and its URL present on the webpage
//---> write a script to print 'text' and its 'URL' of all the links present on the webpage---->using 'foreach' loop
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLinksOnWebpageUsinForeach {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args){
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///C:/Users/Kumar%20Gautam/Desktop/demo2.html");
	    List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
	    for (WebElement link : allLinks) {
	    	String text = link.getText();
	    	String url = link.getAttribute("href");
	    	System.out.println(text+"--> "+url);
			
		}
	
	
	}

}
