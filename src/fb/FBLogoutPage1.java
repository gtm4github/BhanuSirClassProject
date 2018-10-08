package fb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FBLogoutPage1 {

//declaration	
	private WebElement logoutDropdown; 

//initialization
public FBLogoutPage1(WebDriver driver) {   //we r taking driver here bcz we have to use for finding elements
	logoutDropdown=driver.findElement(By.id("userNavigationLabel"));
	
}

//utilization
public void clickDropdown(){
	
	logoutDropdown.click();
	
}
	



	

}
