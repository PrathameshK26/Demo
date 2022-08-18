package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG_Keywords2 {

	@Test(invocationCount = 6) 
	public void TC01(){
		Reporter.log("Running TC01", true);
	}
	
	@Test(priority =-4,invocationCount = 4)
	public void TC02() {
		Reporter.log("Running TC02", true);
		
	}
	
	@Test(priority = 1, enabled = false)
	public void TC03() {
		Reporter.log("Running TC03", false);
		
	}
	
	@Test(dependsOnMethods = "TC05")
	public void TC04() {
		Reporter.log("Running Test Case 4", true);
	}
	
	@Test(priority =1, timeOut = 4000)
	public void TC05() throws InterruptedException {
		Thread.sleep(6000);
		Reporter.log("Running TC05", true);
		
	}
}
