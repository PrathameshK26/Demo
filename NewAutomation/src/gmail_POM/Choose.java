package gmail_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Choose {

	@FindBy(xpath="(//div[@class='_24_Dny'])[3]")private WebElement Click;
	@FindBy(xpath="//span[@class='_2eFmU2 _3ZMjMT'][2]")private WebElement Feedbackno;
	@FindBy(xpath="//select[@class='_1EDlbo _38t9JE _1u-n0L']")private WebElement selectIssue;
	@FindBy(xpath="//option[text()='Above my budget']")private WebElement outofbudget;
	@FindBy(xpath="//textarea[@class='_1sQQBU _1w3ZZo _3pt3BG']")private WebElement writeFeedback;
	@FindBy(xpath="//button[text()='Submit']")private WebElement submit;
	
	public Choose(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void click() {
		Click.click();
	}
	public void feedbackcell() {
		Feedbackno.click();
	}
	public void issueselector() {
		selectIssue.click();
	}
	public void outofbudget() {
		outofbudget.click();
	}
	public void writefeedback() {
		writeFeedback.sendKeys("Give Discount");
	}
	public void submit() {
		submit.click();
	}
}
