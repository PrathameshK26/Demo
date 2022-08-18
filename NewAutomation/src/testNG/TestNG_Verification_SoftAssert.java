package testNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNG_Verification_SoftAssert {

	@Test
	public void test() {
		String expResult = "Quantum Academy";
		String actResult = "Quantum";
		boolean result = false;
		
		SoftAssert soft = new SoftAssert();
		
		//Verification 1:
		soft.assertNotEquals(actResult, expResult, "Actual and Expected result is equal");
		
		//Verification 2:
		soft.assertNotEquals(actResult, expResult, "Actual and Expected result is different");
		
		//Verification 3:
		soft.assertTrue(result, "result is false");
		
		soft.assertAll();
		
	}
}
