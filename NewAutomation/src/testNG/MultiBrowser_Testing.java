package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultiBrowser_Testing {

	@Parameters("browserName")
	@Test
	public void TC01(String browserName) throws InterruptedException {
		WebDriver driver = null;
		
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "F:\\Software testing\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		}else if(browserName.equals("edge")) {
			System.setProperty("webdriver.edge.driver", "F:\\Software testing\\chromedriver_win32\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.quit();
		
	}

}
