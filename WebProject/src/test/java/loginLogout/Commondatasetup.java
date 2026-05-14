package loginLogout;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Commondatasetup {
	@BeforeSuite
	public void datasetup() {
		System.out.println("data setup");
	}
	@AfterSuite
	public void datacleanup() {
		System.out.println("data cleanup");
	}
}
