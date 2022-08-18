package autosuggestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {
	public static void main(String[] args) throws InterruptedException {
		String exp = "oneplus nord";
		System.setProperty("webdriver.chrome.driver", "F:\\Software testing\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
	driver.get("https://www.google.com/");
	Thread.sleep(2000);
	//driver.findElement(By.xpath("//button[@aria-label='No thanks']")).click();//try later
	driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("oneplus");
	Thread.sleep(2000);
	List<WebElement> allOptions = driver.findElements(By.xpath("//ul[@class='G43f7e']/li"));
	for(WebElement option:allOptions) {
		String act = option.getText();
		
		if(act.equals(exp)) {
			option.click();
			break;
		}
		Thread.sleep(2000);
		driver.quit();
	}
	}
}
