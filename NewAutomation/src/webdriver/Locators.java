package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	public static void main(String [] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Software testing\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		//driver.findElement(By.tagName("input")).sendKeys("Prathamesh");
		
		//driver.findElement(By.id("dfg")).sendKeys("Prathamesh");
		
		//driver.findElement(By.className("lll")).sendKeys("jbbrbtfbhjt");
		
		//driver.findElement(By.name("kkk")).sendKeys("123456789");
		
		driver.findElement(By.linkText("Forgotten password?")).click();
		
		//driver.findElement(By.partialLinkText("Lin")).click();
		
		//driver.findElement(By.cssSelector("input[placeholder='Email address or phone number']")).sendKeys("fdfdfdg");
	}
}
