package popup;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example3ChildBrowserPopup {
	public static void main(String [] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Software testing\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
		driver.get("https://skpatro.github.io/demo/links/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//input[@class='btn'])[3]")).click();
		Set<String> id = driver.getWindowHandles();
		ArrayList<String> al = new ArrayList<String>(id);
		driver.switchTo().window(al.get(1));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//span[@class='menu-text'])[18]")).click();
		Thread.sleep(3000);
		System.out.println(al.get(0));
		driver.switchTo().window(al.get(0));
		driver.findElement(By.xpath("(//input[@class='btn'])[1]")).click();
		Thread.sleep(2000);
		driver.quit();
		
		
	}
}
