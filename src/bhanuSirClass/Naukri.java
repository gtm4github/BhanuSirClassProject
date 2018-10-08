package bhanuSirClass;
//navigate().to(url) is also used to enter the URL,instead of get()
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukri {
	static 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		// print html code( source code ) of a web page
				WebDriver driver = new ChromeDriver();
				
				driver.get("http://127.0.0.1/login.do;jsessionid=lp85xvy7fkvd");
				//driver.navigate().to("http://www.gmail.com");
				/*driver.navigate().back();
				driver.navigate().forward();
				driver.navigate().refresh();*/
				
				/*driver.manage().deleteAllCookies();
				
				driver.manage().window().maximize();
				//driver.close();
*/				//driver.quit();
				
				WebElement e = driver.switchTo().activeElement();
				e.sendKeys("admin");
			

}}
