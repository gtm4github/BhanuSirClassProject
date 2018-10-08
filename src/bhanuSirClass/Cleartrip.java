package bhanuSirClass;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.lang.String;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Cleartrip {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args)  {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//enter the URL
		
		driver.get("https://www.cleartrip.com/");
		//enter BANG in FROM field
		driver.findElement(By.id("FromTag")).sendKeys("bang");
		//select Banglore from auto suggestion
		driver.findElement(By.xpath("//a[contains(text(),'Kempegowda')]")).click();
		//Enter goa in To field
		driver.findElement(By.id("ToTag")).sendKeys("GOA");
		//Select Goa from auto suggestion
		driver.findElement(By.xpath("//a[contains(text(),'Dabolim')]")).click();
		//select today's date in calendar
		driver.findElement(By.xpath("//a[contains(@class,'highlight')]")).click();     //cssSelector---> a[class*='highlight']--->sep15-->xpath-->//span[text()='September']/../../../table/tbody/tr[3]/td[6]/a[text()='15']
		//click search button
		driver.findElement(By.id("SearchBtn")).click();
		// get all prices
		//List<WebElement> allPrices = driver.findElements(By.xpath("//th[@class='price']"));
		List<WebElement> allPrices = driver.findElements(By.xpath("//th[@class='price']/span"));
		/*for (WebElement price : allPrices) {
			String text = price.getAttribute("data-pr");//in getAttribute()-->we r passing ATT-NAME as argument and i'll get ATT-VAL in return
	1
			System.out.println(text);
		}*/

		for (WebElement price : allPrices) {
			String text = price.getText();
			
			System.out.println("original:"+text);
			String formatedText=text.substring(1).replaceAll(",","");
			System.out.println("formated: "+formatedText);
			int v=Integer.parseInt(formatedText);
			System.out.println("Int: "+v);
			
		}
		/*for (int i = 1; i < allPrices.size(); i++) {
			String p1 = allPrices.get(i-1).getText().substring(1).replaceAll(",", "");//?????????????????????????
			String p2=allPrices.get(i).getText().substring(1).replaceAll(",", "");
			
			int v1=Integer.parseInt(p1);
			int v2=Integer.parseInt(p2);
			System.out.println("Comparing "+v1+"with "+v2);
			
			if(v1<=v2){
				System.out.println("Pass...");
			}else{
				System.out.println("Fail....");
			}
			
		}*/
		//driver.close();
		/*String s1="₹9,700";
		String s2 = s1.replaceAll("₹", "");
		System.out.println(s1);
		System.out.println(s2);
		*/
	}

}
