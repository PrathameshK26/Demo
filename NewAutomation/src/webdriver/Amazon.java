package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Software testing\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://surl.li/ciypi");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement value = driver.findElement(By.xpath("//input[@id='ap_customer_name']"));
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='Sandeep'", value);
		driver.findElement(By.xpath("//span[@class='a-dropdown-prompt']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@id='auth-country-picker_191']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='a-dropdown-prompt']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@id='auth-country-picker_12']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@tabindex='3']")).sendKeys("1234506789");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("abcs@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("a1@s$w4*");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@tabindex=\"8\"]")).click();
		Thread.sleep(5000);
		driver.quit();
	}
}
