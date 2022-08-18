package DDF_POM_TESTNG_BASE_UTILITY_CLASS;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	static WebDriver driver;
	public static void browserOpen() throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shivaji Kadam\\eclipse-workspace\\NewAutomation\\Browser\\chromedriver.exe");
			driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.get(UtilityClass.getPropertyFileData("URL"));
			
	}
}
