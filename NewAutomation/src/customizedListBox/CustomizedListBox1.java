package customizedListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CustomizedListBox1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Software testing\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(2000); 
		WebElement date = driver.findElement(By.xpath("//select[@title='Day']"));
		Actions act = new Actions(driver);
		act.click(date).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		driver.quit();
	}

}
