package reporteGenerator;

import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Part1 {

	@BeforeSuite
	public void test1(){
		System.out.println("starting of application");
	}
	@AfterSuite
	public void test2() {
		System.out.println("Finishing the Execution");
	}
	
	@Test(groups="regression")
	public void test3() {
		System.out.println("body1");
		
	}
	@Test
	public void test4() {
		System.out.println("body2");
		
	}
}
