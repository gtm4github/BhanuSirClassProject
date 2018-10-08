package fb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FbPomLogin {

	@FindBy(id="email")
	private WebElement unTB;
	
	@FindBy(id="pass")
	private WebElement pwTb;
	
	@FindBy(xpath="//input[@value='Log In']")
	private WebElement loginBTN;

	public FbPomLogin(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void setUserName(String un){
		unTB.sendKeys(un);
	}
	public void setPassword(String pwd){
		pwTb.sendKeys(pwd);
	}
	public void clickLogin(){
		loginBTN.click();
	}
	
}
