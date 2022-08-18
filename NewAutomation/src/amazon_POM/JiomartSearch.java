package amazon_POM;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JiomartSearch {
	@FindBy(xpath="//input[@id='search']")private WebElement wsearch;
	@FindBy(xpath="//input[@id='search']")private WebElement search;
	
	public JiomartSearch(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void whattosearch() {
		wsearch.sendKeys("milk");
	}
	
	public void enter() {
		search.sendKeys(Keys.ENTER);
	}
}
