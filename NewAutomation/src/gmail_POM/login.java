package gmail_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login {

	@FindBy(xpath="//input[@class='_3704LK']")private WebElement Enter;
	@FindBy(xpath="//button[@type='submit']")private WebElement Click;
	@FindBy(xpath="//button[@class='_2KpZ6l _2doB4z']")private WebElement popup;
	
	public login(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void EnterProductName() {
		Enter.sendKeys("macbook air");
	}
	public void click() {
		Click.click();
	}
	public void popup() {
		popup.click();
	}
}
