package loginLogout;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class BeforeGroupsandClasses {
	@BeforeGroups(value = "regression")
	public void beforegroups() {
		System.out.println("Execute before regression");
	}
	@AfterGroups(value = "regression")
	public void aftergroups() {
		System.out.println("Execute after regression");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("Executing Before class");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("Executing after class");
	}
	
	@Test(groups="regression")
	public void Test1() {
		System.out.println("Test1");
	}
	@Test(priority=1,groups="progression")
	public void Test2() {
		System.out.println("Test2");
	}
	@Test(groups= {"progression","regression"})
	public void Test3() {
		System.out.println("Test3");
	}
	@Test(groups="progression")
	public void Test4() {
		System.out.println("Test4");
	}
}
