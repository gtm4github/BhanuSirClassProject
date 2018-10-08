package bhanuSirClass;
/*
  step1: open the browser goto https://www.trivago.in
  step2: type 'b' in search box
  step3: get all the listed option
  step4: print the count,text, and select 'Bengaluru'
*/

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestionTrivago {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://www.trivago.in");
		driver.findElement(By.id("horus-querytext")).sendKeys("b");
		
		List<WebElement> allWebElements = driver.findElements(By.xpath("//span[@class='ssg-title']/following-sibling::span"));
		System.out.println("Total no. of AUTOSUGGESTION is--> "+allWebElements.size());
		
		for (WebElement e : allWebElements) {
			System.out.println(e.getText());
		}
		allWebElements.get(0).click();
		
		
	}

}
