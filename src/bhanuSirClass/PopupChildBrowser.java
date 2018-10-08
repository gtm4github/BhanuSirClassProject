package bhanuSirClass;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupChildBrowser {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.naukri.com");
		//driver.get("http://www.google.com");
		String parent=driver.getWindowHandle();
		Set<String> allWHS = driver.getWindowHandles();
		System.out.println(allWHS.size());
		//allWHS.remove(parent);
		
		for (String wh : allWHS) {
			driver.switchTo().window(wh);
			String title = driver.getTitle();
			if(title.equals("Amazon")){    //---> to close specific CHILD WINDOW
				driver.close();
			}
			
		}
		
		
		
		
	


	}
}



