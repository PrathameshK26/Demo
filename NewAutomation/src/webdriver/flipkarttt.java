package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkarttt {
	public static void main(String [] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Software testing\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//1. get()-used to open specific url
		driver.get("https://www.youtube.com/watch?v=n4QtSanMjYk");
		
		//2. close()-to close tab
		driver.close();
		
		//3. Quit()-to close browser
		driver.quit();
		
	}
}
