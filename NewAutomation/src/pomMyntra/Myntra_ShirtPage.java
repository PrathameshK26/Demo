package pomMyntra;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Myntra_ShirtPage {

	@FindBy(xpath="(//img[@class='img-responsive'])[1]")private WebElement shirt;
	
public Myntra_ShirtPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public void shirt() {
	shirt.click();
}
}
