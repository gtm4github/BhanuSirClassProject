package bhanuSirClass;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {
	// we r putting path f driver executable in STATIC block...to execute this block very first frm main method block
	static{
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
public static void main(String[] args) throws IOException {
	Date d=new Date();
	String v = d.toString();
	System.out.println(v);//contains ":",OS will not allow
	String v2 = v.replaceAll(":", "-");//replaceAll ":",by any other special chacter which is accepted by OS,eg '-'
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://www.google.com");
	TakesScreenshot t=(TakesScreenshot)driver;
	File srcFile = t.getScreenshotAs(OutputType.FILE);
	//File destFile = new File("./photo/a.png");//PNG=Portable Network Graphics
	
	String path="./photo/"+v2+".png";
	System.out.println(path);
	File destFile= new File(path);//we r doing concatenation bcz we need contains f v2 not only v2
	
	FileUtils.copyFile(srcFile, destFile);//we r throwing IOException bcz,there is a chance there is no folder,no space
	driver.close();
	
}

}
