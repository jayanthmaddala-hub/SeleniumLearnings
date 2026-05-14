package loginLogout;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerClass implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test case Execution started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test case passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test case failed, Please try again!");
		System.out.println("Capure Screenshot!");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test case Skipped, Kindly please check");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("Execution started!");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Execution Finished!");
	}
	        
	
}
