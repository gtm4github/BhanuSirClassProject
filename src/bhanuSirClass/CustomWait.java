package bhanuSirClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomWait {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		
		while(true){                   //while is used for infinite condition,but for is used--->n no. f condition
			try{
				driver.findElement(By.id("logoutLink")).click();
				System.out.println("Logout Link is present and clicked");
				break;
			}
			catch(Exception e){
				System.out.println("Logout Link is not present");
			}
		}
		driver.close();
		

}
	}
