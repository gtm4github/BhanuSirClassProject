package bhanuSirClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchronization {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);// implicitWait---->use for findElement() & findElements(),only one time in a program
		
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		
		WebDriverWait wait=new WebDriverWait(driver, 10);  //explicitWait--->it is used exactly before the method [ other than findElement() ]
		wait.until(ExpectedConditions.titleContains("Enter"));
		System.out.println("HomePage Title is: "+driver.getTitle());
	
		driver.findElement(By.id("logoutLink")).click();
		wait.until(ExpectedConditions.titleContains("Login"));
		System.out.println("LoginPage title is: "+driver.getTitle());
		
		driver.close();
	}

}
