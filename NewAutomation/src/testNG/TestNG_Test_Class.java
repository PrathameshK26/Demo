package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG_Test_Class {

	@Test //@ -> annotation - summary of method
	public void test() {
		//System.out.println("Quantum Academy");
		//Reporter.log("Quantum Academy");// message will be displayed on report not displayed on console
		//Reporter.log("Quantum Academy", false);// message will be displayed on report not displayed on console
		Reporter.log("Quantum Academy", true);//message will be displayed on both report and console
	}
}
