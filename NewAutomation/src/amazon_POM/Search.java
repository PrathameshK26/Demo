package amazon_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search {

	@FindBy(xpath="//input[@type='text']")private WebElement whatuwant;
	@FindBy(xpath="//input[@type='submit']")private WebElement search;
	
	public Search(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void whatuwant() {
		whatuwant.sendKeys("mobile");
	}
	public void search() {
		search.click();
	}
}
