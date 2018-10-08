package grid;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DemoB {
	@Parameters({"ip","browser"})
	@Test
	public static void testGrid(String ip,String browser) throws Exception{
		
		URL remoteAddress=new URL("http://"+":4444/wd/hub");
		DesiredCapabilities capabilities=new DesiredCapabilities();
		capabilities.setBrowserName(browser);
		WebDriver driver = new RemoteWebDriver(remoteAddress, capabilities);
	}

}
