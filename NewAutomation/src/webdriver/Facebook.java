package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Software testing\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Rhjkamesh@gskjh.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("12345");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@value='1']")).click();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("ssword?")).click();
		Thread.sleep(2000);
		Dimension n = new Dimension(200,600);
		driver.manage().window().setSize(n);
		Thread.sleep(5000);
		driver.quit();
	}
}
