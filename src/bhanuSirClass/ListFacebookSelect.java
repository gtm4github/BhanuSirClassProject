package bhanuSirClass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListFacebookSelect {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		WebElement listBox = driver.findElement(By.id("month"));
		Select select=new Select(listBox);
		List<WebElement> allOptions = select.getOptions();
		/*select.selectByIndex(3);
		select.deselectByVisibleText("May");*/
		
//-->*** using FOR loop   ***
		System.out.println("*** List of months using FOR loop ***");
		for (int i = 1; i < allOptions.size(); i++) { //if we put i=0 here..'jan' will be the second option
			WebElement option = allOptions.get(i);
			String text = option.getText();   //--------->  [ index ] ,get(index)--->getText()-->sop
			System.out.println(text);
			
		}
		System.out.println("----------------------------------");
		System.out.println("*** List of months using FOREACH loop ***");
//--> *** using FOREACH loop  ***
		for (WebElement option : allOptions) {   //-----> getText()-->sop
			System.out.println(option.getText());
		}
		driver.close();
	}

}
