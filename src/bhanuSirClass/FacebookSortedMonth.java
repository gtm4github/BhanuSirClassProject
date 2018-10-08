package bhanuSirClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSortedMonth {
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
		List<String> allText = new ArrayList<String>();//in order to get the exact content from the list--->we r creating the ARRAYLIST
		
		for (WebElement option : allOptions) {
			allText.add(option.getText());
		}
		Collections.sort(allText);
		for (String text : allText) {
			System.out.println(text);
		}
		/*select.selectByIndex(3);
		select.deselectByVisibleText("May");*/
		
		/*for (int i = 1; i < allOptions.size(); i++) { //if we put i=0 here..'jan' will be the second option
			WebElement option = allOptions.get(i);
			String text = option.getText();
			System.out.println(text);
			
		}*/
		
	}

}



