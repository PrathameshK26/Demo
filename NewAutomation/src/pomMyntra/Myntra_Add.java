package pomMyntra;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Myntra_Add {

	@FindBy(xpath="(//button[@class='btn primary    flex center full-width'])[2]")private WebElement add;
	
	public Myntra_Add(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void add() {
		add.click();
	}
}
