package loginLogout;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemoClass {
	
	@Test(dataProvider = "datap")
	public void Test(String username,String password) {
		System.out.println(username+","+password);
	}
	
	@DataProvider(name = "datap")
	public Object[][] data() {
		Object[][] details = new Object[4][2];
		
		//First row
		details[0][0] = "user1";
		details[0][1] = "pass1";
		
		//Second row
		details[1][0] = "user2";
		details[1][1] = "pass2";
		
		//Third row
		details[2][0] = "user3";
		details[2][1] = "pass3";
				
		//Fourth row
		details[3][0] = "user4";
		details[3][1] = "pass4";
		
		return details;
	}

}
