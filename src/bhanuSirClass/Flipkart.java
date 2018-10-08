package bhanuSirClass;
import java.util.List;
import java.util.TreeSet;
//better to use mozilla
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//WE r finding here min and max price
public class Flipkart {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("(//button)[2]")).click();
		driver.findElement(By.name("q")).sendKeys("iphone x");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//span[text()='iphone x mobile']/..")).click();
		String xp="//div[starts-with(text(),'Apple iPhone')]/../../div[2]/div[1]/div[1]/div[1]";
		List<WebElement> allP = driver.findElements(By.xpath(xp));
		
		TreeSet<Integer> t= new TreeSet<Integer>();//---------> it will not give DUPLICATE VALUES..instead f using collection.sort
		System.out.println("-------All Prices-----");
		
		for (WebElement p : allP) {
			String strPrice=p.getText().substring(1).replaceAll(",", "");
			System.out.println(strPrice);
			int v=Integer.parseInt(strPrice);
			t.add(v);
		}
		System.out.println("------Low & High Prices-------");
		System.out.println(t.first());
		System.out.println(t.last());
		
		
		
		
		
		
		
		
		
		
		
		/*List<WebElement> all = driver.findElements(By.xpath("//*[contains(text(),'iphone x')]/.."));
		System.out.println(all.size());
		for (WebElement e : all) {
			String text = e.getText();
			System.out.println(text);
			System.out.println(e.getTagName());
		}
		//all.get(0);
*/		
	}
}
