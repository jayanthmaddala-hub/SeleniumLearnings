package retryfailedTC;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.IRetryAnalyzer;
import testng2.LaunchDriver;

public class DemoClass extends LaunchDriver{

	@Test
	public void failtheTestCase() throws InterruptedException  {
		Thread.sleep(2000);
		driver.get("https://www.saucedemo.com/");
		Assert.assertTrue(false);
		Thread.sleep(2000);
		
	}
}
