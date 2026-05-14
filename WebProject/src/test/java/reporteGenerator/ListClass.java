package reporteGenerator;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListClass implements ITestListener{

	public void onTestStart(ITestResult result) {
		Reporter.log("TestCase Execution Started");
	}

	
}
