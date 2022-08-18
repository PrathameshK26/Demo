package pom_With_PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InventoryPage {
	
	@FindBy(xpath="//button[text()='Open Menu']")private WebElement Click;
	@FindBy(xpath="//a[text()='Logout']")private WebElement Logout;
	
	public InventoryPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickonOptions() {
		Click.click();
	}
	public void clickonLogout() {
		Logout.click();
	}
	
}
