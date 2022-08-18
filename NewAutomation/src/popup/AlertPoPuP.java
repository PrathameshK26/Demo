package popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPoPuP {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Software testing\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("321");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name='submit']")).click();
		Thread.sleep(2000);
		Alert al = driver.switchTo().alert();
		//1.get text
		System.out.println(al.getText());//Do you really want to delete this Customer?
		//2. accept
		al.accept();
		Thread.sleep(2000);
		//3. dismiss
		//al.dismiss();
		Alert al1 = driver.switchTo().alert();
		System.out.println(al1.getText());
		al1.accept();
		Thread.sleep(2000);
		driver.quit();
		
	}
}
