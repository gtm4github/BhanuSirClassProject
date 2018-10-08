package bhanuSirClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxMyHotel {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Kumar%20Gautam/Desktop/html_web/MyHotel.html");//----> MyHotel.html
		WebElement listBox = driver.findElement(By.id("SLV"));
		Select select=new Select(listBox);//always import 'Select' from selenium package not from apache package-->parameterized constructor
//if we use...select statement twice..it will not deselect the option,as we can do manually bt not here
		select.selectByIndex(0);
		Thread.sleep(1000);
		select.selectByValue("v");
		Thread.sleep(1000);
		select.selectByVisibleText("Dosa");
		
		List<WebElement> a = select.getAllSelectedOptions();
		System.out.println(a.size());
		
		WebElement b = select.getFirstSelectedOption();
		System.out.println(b.getText());
		
		List<WebElement> c = select.getOptions();//---> gives address of each options,doesn't gives text
		System.out.println(c.size());
		
		if(select.isMultiple()){                 //-------->to check whether the ListBox is 'single select' or 'multi select'
			System.out.println("Yes,we can deselect...");
			select.deselectByIndex(0);
			select.deselectByValue("v");
			select.deselectByVisibleText("Dosa");
			select.deselectAll();
		}
		else{
			System.out.println("Sorry cannt use 'deselect' on 'Single Select List Box'");
		}
	}

}
