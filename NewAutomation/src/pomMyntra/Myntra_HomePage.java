package pomMyntra;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Myntra_HomePage {

	@FindBy(css="input[class='desktop-searchBar']")private WebElement input;
	
public Myntra_HomePage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public void clickshirtenter() {
	input.click();
	input.sendKeys("shirt");
	input.sendKeys(Keys.ENTER);
}
}
