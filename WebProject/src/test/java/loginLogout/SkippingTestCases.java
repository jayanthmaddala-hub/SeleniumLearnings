package loginLogout;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkippingTestCases {
	
	boolean condition = true;
	
	@Test(enabled=false)
	public void Test1() {
		System.out.println("Do not execute this TestCase");
	}
	@Test
	public void Test2() {
		System.out.println("Skip this Test case");
		throw new SkipException("Perform Skipping");
	}

	@Test
	public void Test3() {
		
		if(condition==true) {
			System.out.println("Testcase Executed sucessfully");
		}
		else {
			System.out.println("Skip this Test case using condition");
			throw  new SkipException("Performs Skippping");
		}
	}
}
