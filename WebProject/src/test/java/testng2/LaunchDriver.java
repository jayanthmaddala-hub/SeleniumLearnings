package testng2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchDriver {

	public static WebDriver driver = null;
	@BeforeSuite
	public void LauchDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	@AfterSuite
	public void CloseDriver() {
		driver.close();
	}
}
