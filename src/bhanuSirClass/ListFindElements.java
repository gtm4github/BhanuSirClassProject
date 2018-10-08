package bhanuSirClass;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListFindElements {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Kumar%20Gautam/Desktop/html_web/demo2.html");
//		WebElement v = driver.findElement(By.linkText("Gmail"));
//		v.click();
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));//findelements never throws any exception,if there is no any element found,it will give EMPTY LIST
		int count = allLinks.size();
		System.out.println(count);
		
		WebElement link = allLinks.get(1);
		link.click();
	}

}
