package loginLogout;

import org.testng.annotations.Test;

@Test(groups="UI")
public class TestNGroups extends Commondatasetup{

	@Test(groups="regression")
	public void Test1() {
		System.out.println("Test1");
	}
	@Test(priority=1, groups="regression")
	public void Test2() {
		System.out.println("Test2");
	}
	@Test(groups="progression")
	public void Test3() {
		System.out.println("Test3");
	}
	@Test(groups= {"regression","progression"})
	public void Test4() {
		System.out.println("Test4");
	}
}
