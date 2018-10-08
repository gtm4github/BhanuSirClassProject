package grid;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class DemoA {
	@Test
	public static void testGrid() throws Exception{
		String ip="192.168.146.1";// ??????????
		String browser="chrome";
		
		URL remoteAddress=new URL("http://"+":4444/wd/hub");
		DesiredCapabilities capabilities=new DesiredCapabilities();
		capabilities.setBrowserName(browser);
		WebDriver driver = new RemoteWebDriver(remoteAddress, capabilities);
	}

}
