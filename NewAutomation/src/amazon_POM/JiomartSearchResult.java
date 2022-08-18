package amazon_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JiomartSearchResult {
	@FindBy(xpath="(//span[@class='txt_btn'])[3]")private WebElement milk;
	@FindBy(xpath="//a[@class='cart_text']")private WebElement cart;
	
public JiomartSearchResult(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public void selectmilk() {
	milk.click();
}

public void gotocart() {
	cart.click();
}

}
