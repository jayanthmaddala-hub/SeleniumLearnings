package loginLogout;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotations extends Commondatasetup{
	
	@BeforeTest
	public void BeforeT() {
		System.out.println("Login");
	}

	@AfterTest
	public void AfterT() {
		System.out.println("Log out");
	}
	
	@BeforeMethod
	public void BeforeM() {
		System.out.println("connect DB");
	}
	
	@AfterMethod
	public void AfterM() {
		System.out.println("Discconect DB");
	}
	
	@Test
	public void Test1(){
		System.out.println("Test1");
	}
	@Test
	public void Test2() {
		System.out.println("Test2");
	}
}
