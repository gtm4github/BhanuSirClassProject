package excelSheet;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import generic.Utility;

public class Result implements ITestListener{
	static int passCount=0,failCount=0;//global variable

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {

		String name=result.getName();
		Reporter.log("Test: "+name+" is Pass ",true);
		passCount++;
		
	}

	@Override
	public void onTestFailure(ITestResult result) {

		String name=result.getName();
		Reporter.log("Test: "+name+" is Fail ",true);
		failCount++;
		
	}
	@Override
	public void onFinish(ITestContext context) {

		Reporter.log("Pass:"+passCount,true);
		Reporter.log("Fail:"+failCount,true);
		Utility.writeResultToXL("./result/Summary.xlsx",passCount,failCount);
		//update only above 3 mentioned methods & keep all the others methos as it is
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	
	

}
