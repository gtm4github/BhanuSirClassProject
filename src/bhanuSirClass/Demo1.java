package bhanuSirClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.actitime.com/login.do");
		String actualTitle = driver.getTitle();
		System.out.println("Actual Title is: "+actualTitle);
		String expectedTitle="actiTIME - Login";
		System.out.println("Expected title is: "+expectedTitle);
		
		if(actualTitle.equals(expectedTitle))
		{
			System.out.println("PASS: Title is matching");
		}else{
			System.out.println("FAIL: Title is not matching");
		}
		//3> Enter username,enter password & click login button
		WebElement username = driver.findElement(By.id("username"));
		boolean displayed = username.isDisplayed();
		System.out.println(displayed);
		WebElement pwd = driver.findElement(By.name("pwd"));
		pwd.isDisplayed();
		/*WebElement un = driver.findElement(By.id("username")).sendKeys("admin");
		WebElement pwd = driver.findElement(By.name("pwd")).sendKeys("manager");
		*/
		WebElement loginButton = driver.findElement(By.xpath("//div[text()='Login ']"));
		loginButton.isDisplayed();
		
		username.sendKeys("admin");
		pwd.sendKeys("manager");
		loginButton.click();
		Thread.sleep(5000);
		String eHPTitle="actiTIME - Enter Time-Track";
		System.out.println("eHPTitle"+eHPTitle);
		
		String aHPTitle=driver.getTitle();
		if(aHPTitle.equals(expectedTitle)){
			System.out.println("pass..");
		}else{
			System.out.println("fail..");
		}
		
	}

}
