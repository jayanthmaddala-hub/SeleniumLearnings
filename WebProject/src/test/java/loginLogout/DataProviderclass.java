package loginLogout;
import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;


public class DataProviderclass {
	
	@DataProvider(name="create")
	public Object[][] data(Method m) {
		Object[][] testdata = null;
		if(m.getName().equals("Test")) {	
			testdata = new Object[][] {
			{"User1","Pass1"},
			{"User2","pass2"},
			{"user3","pass3"},
			{"user4","pass5"}
		};
		}else if(m.getName().equals("Test1")){
			testdata = new Object[][] {
				{"User1","Pass1","test1"},
				{"User2","pass2","test2"},
				{"user3","pass3","test3"},
				{"user4","pass5","test4"}
			};
		}
		return testdata;
	}
	

}
