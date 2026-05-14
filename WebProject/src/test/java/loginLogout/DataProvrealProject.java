package loginLogout;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProvrealProject {

	@Test(dataProvider="Test3")
	public void Test1(String username, String password) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("user-name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("login-button")).click();
		
		driver.close();
	}
	
	@DataProvider
	public Object[][] Test3() {
		return new Object[][] {
			{"standard_user","secret_sauce"},
			{"locked_out_user","secret_sauce"},
			{"problem_user","secret_sauce"},
			{"performance_glitch_user","secret_sauce"}
		};
				}
	@DataProvider
	public Object[][] Test2() {
		Object[][] ld = new Object[4][2];
		
		//First row
				ld[0][0] = "standard_user";
				ld[0][1] = "secret_sauce";
				
				//Second row
				ld[1][0] = "locked_out_user";
				ld[1][1] = "secret_sauce";
				
				//Third row
				ld[2][0] = "problem_user";
				ld[2][1] = "secret_sauce";
						
				//Fourth row
				ld[3][0] = "performance_glitch_user";
				ld[3][1] = "secret_sauce";
				
				return ld;
	}
	
}
