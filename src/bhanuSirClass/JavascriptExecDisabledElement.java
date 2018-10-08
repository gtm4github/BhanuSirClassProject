package bhanuSirClass;
/*
 ---> Handling Disabled Element
  # create a webpage with below code
  # <input type="text" id="t1" value="qsp" disabled>
    --> write selenium code to type 'abc' into the textbox present in above webpage
*/
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecDisabledElement {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Kumar%20Gautam/Desktop/QSP.html");
		//driver.findElement(By.id("t1")).sendKeys("abc");
//--> bcz it is disabled 
//-->Note:So,if we run above script we get 'InvalidElementStateException',To handle Disabled Element we use JavascriptExecutor
		
		String code="document.getElementById('t1').value='abc'";
		JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript(code);
		
		//Limitation: JS supports only TAG,ID,NAME, and CLASS
	}

}
