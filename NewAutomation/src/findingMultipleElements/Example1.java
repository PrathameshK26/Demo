package findingMultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Software testing\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	Thread.sleep(2000);
	List<WebElement> nooflink = driver.findElements(By.xpath("//a"));
	System.out.println(nooflink.size());
	for(WebElement wl:nooflink) {
		System.out.println(wl.getText());
	}
	Thread.sleep(2000);
	driver.quit();
	
	}
}
