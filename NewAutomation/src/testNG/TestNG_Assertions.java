package testNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG_Assertions {
	
	//1. AssertEquals
	/*@Test
	public void test() {
		Reporter.log("Running Test Method", true);
		String expResult = "Quantum Academy";
		String actResult = "Quantum";
		
		Assert.assertEquals(actResult, expResult, "Actual and Expected Results are not equal");
	}*/
	
	//2. AssertNotEquals
	/*@Test
	public void test() {
		Reporter.log("Running Test Method", true);
		String expResult = "Quantum Academy";
		String actResult = " Academy";
		
		Assert.assertNotEquals(actResult, expResult, "Actual and Expected Result is Samee");
		
	}*/
	
	//3. AssertTrue
	/*@Test
	public void test() {
		Reporter.log("Running test method", true);
		boolean result = true;
		
		Assert.assertTrue(result, "result is false");
	}*/
	
	//4. AssertFalse
	/*@Test
	public void test() {
		Reporter.log("Running test caese", true);
		boolean result = false;
		
		Assert.assertFalse(result, "result is true");
		
	}*/
	
	//5. AssertNull
	/*@Test
	public void test() {
		Reporter.log("Running test case", true);
		String result = null;
		
		Assert.assertNull(result, "result is not null");
	}*/
	
	//6. AssertNotNull
	@Test
	public void test() {
		String result = "Quantum Academy";
		
		Assert.assertNotNull(result, "result is null");
		
	}
	
	//7. fail
	@Test
	public void test1() {
		Reporter.log("Running fail test", true);
		
		Assert.fail("Fails");
	}
	

}
