package bhanuSirClass;

//[---> verify TITLE of actiTime Login Page and HomePage using THREAD.SLEEP  <---]

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTitle {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
	}
	public static void main(String[] args) throws InterruptedException {
		// 1.open the browser
		WebDriver driver = new ChromeDriver();
		// 2.Enter the URL
		driver.get("https://demo.actitime.com/login.do");
		//verify Login page is displayed
		// Check point 1-> Verify Title
		String expectedTitle="actiTIME - Login";
		System.out.println("Expected Login Page Title:"+expectedTitle);
		String actualTitle=driver.getTitle();
		System.out.println("Actual Login Page Title:"+actualTitle);
		if(actualTitle.equals(expectedTitle)){
			System.out.println("Pass: Login Page Title is matching...");
		}
		else{
			System.out.println("Fail: Login Page Title is Not Matching...");
		}
		// Check point 2-> Verify Elements are present or not
		
		// 3. Enter the USERNAME
		WebElement userName=driver.findElement(By.id("username"));
		userName.sendKeys("admin");
		if(userName.isDisplayed()){
			System.out.println("Pass");
		}
		else{
			System.out.println("Fail");
		}
		//4. Enter the password
		driver.findElement(By.name("pwd")).sendKeys("manager");
		//5. click on login
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		//use THREAD.SLEEP to overcome SYNCHONIZATION ISSUE
		Thread.sleep(2000);
		String expectedHPtitle="actiTIME - Enter Time-Track";
		System.out.println("Expected Home Page Title: "+expectedHPtitle);
		String actualHPtitle = driver.getTitle();
		System.out.println("Home Page Title is: "+actualHPtitle);
		
		if(actualHPtitle.equals(expectedHPtitle)){
			System.out.println("Pass: Home page title is matching");
		}else{
			System.out.println("Fail: Home page title is not matching ");
		}
		
		driver.close();
	}

}
