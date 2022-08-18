package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG_Keywords1 {

	@Test(priority = 2)
	public void TC01(){
		Reporter.log("Running Test Case 1", true);
		}
	@Test(priority = -1)
	public void TC02() {
		Reporter.log("Running Test Case 2", true);
	}
	@Test
	public void TC03() {
		Reporter.log("Running Test Case 3", true);
	}
}
