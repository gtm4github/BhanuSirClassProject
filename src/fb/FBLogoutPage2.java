
package fb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FBLogoutPage2 {

//declaration	
	private WebElement logoutBTN;

//initialization
public FBLogoutPage2(WebDriver driver) {   //we r taking driver here bcz we have to use for finding elements
	logoutBTN=driver.findElement(By.xpath("//span[text()='Log Out']"));
	
}

//utilization
public void logOut(){
	
	logoutBTN.click();
	
}
	



	

}
