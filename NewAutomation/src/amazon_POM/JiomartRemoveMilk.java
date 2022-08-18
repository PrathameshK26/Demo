package amazon_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JiomartRemoveMilk {
	@FindBy(xpath="//span[@class='minus']")private WebElement minus;
	
public JiomartRemoveMilk(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public void remove() {
	minus.click();
}
}
