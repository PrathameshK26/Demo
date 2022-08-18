package webdriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class openchrome {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Software testing\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Dimension d = new Dimension(300,600);
		driver.manage().window().setSize(d);
	}
}
