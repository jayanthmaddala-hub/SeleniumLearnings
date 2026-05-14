package retryfailedTC;

import org.testng.ITestResult;

public class Retry {

	private int retryCount = 0;
	private static final int MaxRetryCount = 3;
	
	public boolean retry(ITestResult result) {
		if (retryCount < MaxRetryCount) {
			retryCount++;
			return true;
		}
		return false;
	}
}
