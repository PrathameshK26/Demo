package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNg_Keywords {

	/*@Test(invocationCount = 6)
	public void TC01() {
		Reporter.log("Running TC01", true);
	}*/
	
	@Test(priority = 1)
	public void TC02() {
		Reporter.log("Running TC02", true);
	}
	
	@Test(priority = 1)
	public void TC03() {
		Reporter.log("Running TC03", true);
	}
	
	@Test (priority = -5)
	public void TC04() {
		Reporter.log("Running TC04", true);
	}
}
