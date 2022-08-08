package DDF_POM_TESTNG_BASE_UTILITY_CLASS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogoutPage {
@FindBy(xpath="//a[contains(text(),'Logout')]") private WebElement logOutBtn;
	
	public KiteLogoutPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickKiteLogOutPageLogOutBtn() {
		logOutBtn.click();
	}
}
