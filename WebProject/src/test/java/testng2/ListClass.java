package testng2;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListClass extends CaptureScreenOnFailure implements ITestListener{

	public void onTestFailure(ITestResult result) {
		System.out.println("Test Case Failed");
		try {
			getScreenshot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void onStart(ITestContext context) {
		System.out.println("Execution Started!");
	}

	public void onFinish(ITestContext context) {
		System.out.println("Execution Finished!");
	}

}
