package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG_Verifications_AssertClass_Disadvantage {

	@Test
	public void test() {
		String expResult = "Quantum Academy";
		String actResult = "quantum";
		boolean result = false;
		
		//verification 1
		Assert.assertNotEquals(actResult, expResult, "Actual and Expected result is same");
		
		//verification 2
		Assert.assertEquals(actResult, expResult, "Actual and Expected result are different");
		
		//verification 3
		Assert.assertTrue(result, "result is false");
		
		/*Output: java.lang.AssertionError: act and exp result is different 
		expected [quantum academy] but found [quantum]
        disadvantage: if any of assertion/verification gets failed,
				then remaining assertions will not get checked.*/
	}
}
