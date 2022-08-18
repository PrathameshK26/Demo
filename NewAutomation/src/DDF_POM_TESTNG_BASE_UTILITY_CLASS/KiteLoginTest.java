package DDF_POM_TESTNG_BASE_UTILITY_CLASS;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class KiteLoginTest extends BaseClass {
	KiteLoginPage1 login1;
	KiteLoginPage2 login2;
	KiteHomePage home;
	KiteLogoutPage logout;
	@BeforeClass
	public void BrowserOpen() throws IOException {
		browserOpen();
		login1 = new KiteLoginPage1(driver);
		login2 = new KiteLoginPage2(driver);
		home = new KiteHomePage(driver);
		logout = new KiteLogoutPage(driver);
	}
	@BeforeMethod
	public void Login() throws EncryptedDocumentException, IOException {
		login1.setKiteLoginPage1Username(UtilityClass.getTestData(0, 0));
		login1.setKiteLoginPage2Password(UtilityClass.getTestData(0, 1));
		login1.clickKiteLoginPage1LoginBtn();
		
		login2.setKiteLoginPage2PIN(UtilityClass.getTestData(0, 2));
		login2.clickKiteLoginPage2ContinueBtn();
		
	}
	
	@Test
	public void Test() throws EncryptedDocumentException, IOException {
		String expResult = UtilityClass.getTestData(0, 3);
		String actResult = home.verifyKiteHomePageProfileName();
		
		Assert.assertEquals(actResult, expResult, "UN is Different");
	}
	
	
	@AfterMethod
	public void Logout(ITestResult result) throws IOException {
		
		if(result.getStatus()==ITestResult.FAILURE) {
			int TCID = 100;
			UtilityClass.captureScreenshot(driver, TCID);
		}
		home.clickKiteHomePageUserId();
		logout.clickKiteLogOutPageLogOutBtn();
		
		
	}
	
	@AfterClass
	public void CloseBrowser() {
		driver.quit();
		
	}
	
	
}
