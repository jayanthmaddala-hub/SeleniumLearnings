package reportGen2ReportNG;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listnclass extends ScreenShotClass implements ITestListener{

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Capturing Screenshot!");
		
		try {
			captureScreen();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Reporter.log("<a href=\"C:\\EW\\WebProject\\Screenshot\\Tue-Sep-26-09-44-18-IST-2023.png\">TestNG Results</a>");
	}

	public void onTestStart(ITestResult result) {
		System.out.println("Execution Started!");
	}

	
	

	
}
