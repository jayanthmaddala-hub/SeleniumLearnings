package loginLogout;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UseAssertion extends Commondatasetup{
	
	
	
	@Test
	public void Test1(){
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		
		String ExpectedTitle = "Electronics, Cars, Fashion, Collectibles & More | eBay";
		String ActualTitle = driver.getTitle();
		
		Assert.assertEquals(ExpectedTitle, ActualTitle);
		
		driver.close();
	}
	
}
