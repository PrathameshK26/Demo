package listBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getallselectedoptions {
	public static void main(String [] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Software testing\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(2000);
		WebElement months = driver.findElement(By.xpath("(//select[@id='month'])"));
		Select s = new Select(months);
		Thread.sleep(2000);
		List<WebElement> allSelOpt = s.getAllSelectedOptions();
		Thread.sleep(2000);
		for(WebElement oio : allSelOpt) {
			System.out.println(oio.getText());//july
		}
		Thread.sleep(3000);
		driver.quit();
	}
}
