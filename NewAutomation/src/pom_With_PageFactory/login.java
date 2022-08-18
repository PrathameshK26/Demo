package pom_With_PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login {

	@FindBy(xpath="//input[@id='user-name']")private WebElement UN;
	@FindBy(xpath="//input[@id='password']")private WebElement PWD;
	@FindBy(xpath="//input[@id='login-button']")private WebElement LgnBtn;
	
	public login(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	public void enterUsername() {
		UN.sendKeys("standard_user");
	
	}
	public void enterPassword() {
		PWD.sendKeys("secret_sauce");
	
	}
	public void clickonsignin() {
		LgnBtn.click();
	}
}
