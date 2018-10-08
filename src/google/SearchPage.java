package google;
//---> how do you handle multiple elements in POM       <--------


import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
	@FindBy(xpath="//a")
	private List<WebElement> allLinks;//----> by using @FindBy itself and List<WebElement>

	public SearchPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
		
	}
	
	public void printLinkCount(){
		int count=allLinks.size();
		System.out.println(count);
	}
	
	

}
