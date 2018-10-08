package bhanuSirClass;
import org.openqa.selenium.JavascriptExecutor;
//vbscript
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExe {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
	
		driver.get("http://demo.actitime.com");
		JavascriptExecutor j=(JavascriptExecutor)driver;//---> typecasting
		//j.executeScript("alert('Hi')");---> goto CONSOLE in html sourcecode & type any method of javascript eg: alert
		String msg="Happy Festivals";
/*here we pass 'javascript statement' as an argument to the 'executeScript()' method of 'JavascriptExecutor' interface,
   which is one the interface of SELENIUM WEBDRIVER		
*/	    j.executeScript("alert('"+msg+"')");//--> *** concatenation should be done properly  ***
	}
}
