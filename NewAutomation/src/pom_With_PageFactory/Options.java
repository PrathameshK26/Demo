package pom_With_PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Options {

	//1. Declaration
	@FindBy(xpath="//button[@type='button'][1]") private WebElement Options;
	
	//2. Initialization
	public Options(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	//3. Utilize
	public void clickOnOptionsButton() {
		Options.click();
	}
	
@FindBy(xpath="//a[contains(text(),'Sign in')]") private WebElement SI;
	
	
		
	public void clickonsignin() {
		SI.click();
}
}