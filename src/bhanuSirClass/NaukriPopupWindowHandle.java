package bhanuSirClass;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukriPopupWindowHandle {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		/*
		driver.get("http://www.naukri.com");
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);
		
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles.size());
		System.out.println(windowHandles);*/
		
		driver.get("http://www.google.com");
		Set<String> handles = driver.getWindowHandles();
		
		System.out.println(handles.size());
		System.out.println(handles);
	}
}
