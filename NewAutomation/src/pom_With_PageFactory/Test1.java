package pom_With_PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Software testing\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		login lgn = new login(driver);
		lgn.enterUsername();
		lgn.enterPassword();
		lgn.clickonsignin();
		
		Thread.sleep(2000);

		InventoryPage Ipg = new InventoryPage(driver);
		Ipg.clickonOptions();
		Thread.sleep(2000);
		Ipg.clickonLogout();
	}
}
