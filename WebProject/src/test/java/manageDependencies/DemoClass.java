package manageDependencies;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoClass {

	@Test
	public void UserRegistration() {
		System.out.println("User registered successfully!");
		Assert.assertTrue(false);
		
	}
	
	@Test(dependsOnMethods="UserRegistration",alwaysRun=true)
	public void UserSearch() {
		System.out.println("Search for User");
	}
}
