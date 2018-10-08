package bhanuSirClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoCustm {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		for(int i=1; i<=200;i++){    //while(true){   
			String title=driver.getTitle();
			if(title.contains("Enter")){
				System.out.println("Now in Home Page,Title of Home Page is: "+title);
				break;
			}else{
				System.out.println("still in Login Page: Iteration-> "+i);
			}
		}
		driver.close();

}
}
