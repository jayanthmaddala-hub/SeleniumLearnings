package loginLogout;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Implementlisteners {
	

	@Test()
	public void Test1() {
		System.out.println("Test1");
	}
	@Test()
	public void Test2() {
		System.out.println("Test2");
	}
	@Test()
	public void Test3() {
		System.out.println("Test3");
		Assert.assertTrue(false);
	}
	@Test()
	public void Test4() {
		System.out.println("Test4");
	}
}
