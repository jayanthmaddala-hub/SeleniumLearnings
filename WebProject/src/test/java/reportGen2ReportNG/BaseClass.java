package reportGen2ReportNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	@Test(groups="regression")
	public void test1() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		Assert.assertTrue(false);
		driver.close();
	}
	@Test
	public void test2() {
		System.out.println("body2");
		
	}
	@Test
	public void test3() {
		System.out.println("body3");
		
	}
}
