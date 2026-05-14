package loginLogout;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;


public class SoftAssertExample extends Commondatasetup{

	@Test
	public void Test() {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		String ExpectedTitle = "Electronics, Cars, Fashion, Collectibles & More | eBay";
		String ExpectedText = "Search";
		String ActualTitle = driver.getTitle();
		String ActualText = driver.findElement(By.xpath("//*[@id='gh-btn']")).getAttribute("value");
		
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(ExpectedTitle, ActualTitle, "Actual Title is failed");
		softAssert.assertEquals(ActualText, ExpectedText, "Actual Text is failed");
		softAssert.assertAll();
		driver.close();
		
	}
}
