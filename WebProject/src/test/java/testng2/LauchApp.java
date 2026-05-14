package testng2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LauchApp extends LaunchDriver{

	@Test
	public void LauchApplication() throws InterruptedException {
		Thread.sleep(2000);
		driver.get("https://www.saucedemo.com/");
		Assert.assertTrue(false);
		Thread.sleep(2000);
	}
}
