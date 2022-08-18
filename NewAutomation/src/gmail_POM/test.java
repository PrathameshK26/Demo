package gmail_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {

	public static void main(String [] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Software testing\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		login ln = new login(driver);
		ln.popup();
		ln.EnterProductName();
		ln.click();
		Thread.sleep(2000);
		Choose Cs = new Choose(driver);
		Cs.click();
		Thread.sleep(2000);
		Cs.feedbackcell();
		Thread.sleep(2000);
		Cs.issueselector();
		Thread.sleep(2000);
		Cs.outofbudget();
		Thread.sleep(2000);
		Cs.writefeedback();
		Thread.sleep(2000);
		Cs.submit();
		Thread.sleep(2000);
		driver.quit();
		
		
	}
}
