package bhanuSirClass;



	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

	public class ListSingleSelect {
	
		static{
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		}
		public static void main(String[] args) {
			WebDriver driver = new ChromeDriver();
			driver.get("file:///C:/Users/Kumar%20Gautam/Desktop/html_web/MyHotel.html");
			WebElement listBox = driver.findElement(By.id("MTR"));
			Select select=new Select(listBox);
			select.selectByValue("t");//---> select the element by using 'value' in single select list
		}

}
