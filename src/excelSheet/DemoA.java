package excelSheet;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Result.class)
public class DemoA {

	@Test
	public void createCustomer() {
		Reporter.log("Create a customer",true);
		Assert.fail();
	}
	@Test
	public void deleteCustomer() {
		Reporter.log("Delete a customer",true);
	}

}
