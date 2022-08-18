package customizedListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_DropDownList {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Software testing\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(2000);
		WebElement login = driver.findElement(By.xpath("//a[@class='_1_3w1N']")); 
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		//1. moveToElement - used to move to web element(which contains drop down list)
		act.moveToElement(login).perform();
		Thread.sleep(2000);
		//2. contextClick -to perform right click
		act.contextClick(login).perform();
		Thread.sleep(2000);
		
		//3. click - to perform left click
		act.click().perform();
		Thread.sleep(3000);
		driver.quit();
	}
}
