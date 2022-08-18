package amazon_POM;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jiomart {

	public static void main(String[]args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Software testing\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
	driver.get("https://www.jiomart.com/");
	Thread.sleep(2000);
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='search']")).sendKeys("milk");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='search']")).sendKeys(Keys.ENTER);
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//span[@class='txt_btn'])[3]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@class='cart_text']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[@class='minus']")).click();
	}
}
