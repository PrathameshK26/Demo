package amazon_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JioMartTest {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Software testing\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	driver.get("https://www.jiomart.com/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	JiomartSearch s  = new JiomartSearch(driver);
	s.whattosearch();
	s.enter();
	Thread.sleep(2000);
	JiomartSearchResult r = new JiomartSearchResult(driver);
	r.selectmilk();
	r.gotocart();
	Thread.sleep(3000);
	JiomartRemoveMilk rm = new JiomartRemoveMilk(driver);
	rm.remove();
	Thread.sleep(3000);
	driver.quit();
	}
}
