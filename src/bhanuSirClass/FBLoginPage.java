package bhanuSirClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FBLoginPage {
//declaration
	private WebElement unTB;
	private WebElement pwTB;
	private WebElement loginBTN;
	
//initialization

public FBLoginPage(WebDriver driver) {
	unTB=driver.findElement(By.id("email"));
	pwTB=driver.findElement(By.id("pass"));
	loginBTN=driver.findElement(By.xpath("//input[@value='Log In']"));
	
}//utilization

 public void setUserName(String un){
	 unTB.sendKeys(un);
 }
 public void setPassword(String pw){
	 pwTB.sendKeys(pw);
	 
 }
 public void clickLogin(){
	 loginBTN.click();
 }

	
	

}
