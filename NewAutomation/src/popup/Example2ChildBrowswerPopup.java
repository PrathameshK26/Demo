package popup;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2ChildBrowswerPopup {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Software testing\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
	driver.manage().window().maximize();
	driver.get("https://skpatro.github.io/demo/links/");
	driver.findElement(By.xpath("(//input[@type='button'])[3]")).click();
	Set<String> ids = driver.getWindowHandles();
	ArrayList<String> al = new ArrayList<String>(ids);
	driver.switchTo().window(al.get(1));
	driver.manage().window().maximize();
	driver.findElement(By.xpath("(//span[@class='menu-item-text'])[14]")).click();
	Thread.sleep(7000);
	System.out.println(al.get(0));
	driver.switchTo().window(al.get(0));
	Thread.sleep(5000);
	driver.findElement(By.xpath("(//input[@class='btn'])[2]")).click();
	Thread.sleep(5000);
	driver.quit();
}
}
