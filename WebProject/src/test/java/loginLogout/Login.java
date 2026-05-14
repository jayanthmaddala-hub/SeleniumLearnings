package loginLogout;

import org.testng.annotations.Test;

@Test(groups="UI")
public class Login extends Commondatasetup{

	@Test(priority=1)
	public void bloginTest() {
		System.out.println("Login was successfull");
	}
	
	@Test(priority=2)
	public void alogoutTest() {
		System.out.println("Logged out!");
	}


}
