package bhanuSirClass;

//   ---->*** to upload CV on naukri.com    ***<----

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupFileUpload {
	static{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.naukri.com");
		driver.findElement(By.xpath("//span[text()='Later']")).click();
		File f=new File("./CV/gtm_CV.docx"); //create a folder CV in your project and paste your cv in this folder
		String path=f.getAbsolutePath();// we r converting ---relative path into absolute path
		
		//driver.findElement(By.id("input_resumeParser")).sendKeys("F:/gtm_CV.docx");// [we cannot give relative path,for sendkeys---->  ./CV/gtm_CV.docx]
		//Thread.sleep(2000);
		driver.findElement(By.id("input_resumeParser")).sendKeys(path);
		
		//Hidden Division Popup
		
		String msg=driver.findElement(By.className("success")).getText(); 
		System.out.println(msg);

 }
}
    