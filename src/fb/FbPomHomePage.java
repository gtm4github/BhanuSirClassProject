package fb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FbPomHomePage {
	@FindBy(id="userNavigationLabel")
	private WebElement logoutDRPDWN;
	
	@FindBy(xpath="//span[text()='Log Out']")
	private WebElement logoutBTN;

	public FbPomHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickDropDown(){
		logoutDRPDWN.click();
	}
	
	public void clickLogout(){
		System.out.println("hii...");
		logoutBTN.click();
	}
	
	

}
