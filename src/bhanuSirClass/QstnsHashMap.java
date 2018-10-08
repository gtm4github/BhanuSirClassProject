package bhanuSirClass;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class QstnsHashMap {

	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/Kumar%20Gautam/Desktop/SLV.html");
		WebElement listBox = driver.findElement(By.id("SLV"));
		Select select=new Select(listBox);
		List<WebElement> allOptions = select.getOptions();
		LinkedHashMap<String,Integer> map = new LinkedHashMap<String,Integer>();
		for (WebElement option : allOptions) {
			String key = option.getText();
			if(map.containsKey(key)){
				Integer value = map.get(key);
				value++;
				map.put(key, value);
			}
			else{
				map.put(key, 1);
			}
		}
		//Q5
		System.out.println(map);
		//q6
		String s="Idly";
		if(map.get(s)>1){
			System.out.println(s+" is Duplication");
		}
		else{
			System.out.println(s+" is NOT Duplication");
		}
		//q7
		System.out.println(map.keySet());
		//q8
		for (String key : map.keySet()) {
			if(map.get(key)==1){
				System.out.println(key);
			}
		}
		//q9
		for (String key : map.keySet()) {
			if(map.get(key)>1){
				System.out.println(key);
			}
		}
	}
}
