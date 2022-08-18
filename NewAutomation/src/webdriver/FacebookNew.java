package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookNew {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Software testing\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@rel='async']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='First name']")).sendKeys("S");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("PB");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("1234567890");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@data-type='password']")).sendKeys("a@a#s23D%");
		Thread.sleep(2000);
		
		//step 1:
		WebElement date = driver.findElement(By.xpath("//select[@title='Day']"));
		Thread.sleep(2000);	
		//step 2:
		Select s = new Select(date);
		Thread.sleep(2000);
		//step 3:
		s.selectByValue("2");
		Thread.sleep(2000);
		WebElement month = driver.findElement(By.xpath("//select[@title='Month']"));
		Select d = new Select(month);
		d.selectByIndex(2);
		
		driver.quit();
	}
}



//s.selectByIndex(2);//2020

		//s.selectByValue("1945");
				
				//s.selectByVisibleText("1998");