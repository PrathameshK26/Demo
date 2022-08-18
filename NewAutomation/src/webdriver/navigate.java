package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigate {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Software testing\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//7. navigate
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.navigate().to("https://www.instagram.com/");
		Thread.sleep(5000);
		driver.navigate().back();//facebook
		Thread.sleep(5000);
		driver.navigate().forward();//insta
		Thread.sleep(5000);
		driver.manage().window().minimize();
		Thread.sleep(5000);
		driver.navigate().back();//facebook
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//driver.manage().window().getPosition();
		Thread.sleep(5000);
		driver.navigate().refresh();
		Thread.sleep(5000);
		driver.quit();
	}
}
