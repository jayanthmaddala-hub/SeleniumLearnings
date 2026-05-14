package loginLogout;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
	
	@Test(dataProvider = "create",dataProviderClass=DataProviderclass.class)
	public void Test(String username,String password) {
		System.out.println(username+","+password);
	}
	
	@Test(dataProvider = "create",dataProviderClass=DataProviderclass.class)
	public void Test1(String username,String password, String Test) {
		System.out.println(username+","+password+","+Test);
	}
	
	

}
