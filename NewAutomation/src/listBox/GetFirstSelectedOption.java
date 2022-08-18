package listBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetFirstSelectedOption {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Software testing\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(2000);
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		Select s = new Select(day);
		s.selectByVisibleText("16");
		System.out.println(s.getFirstSelectedOption().getText());//16
		Thread.sleep(9000);
		driver.quit();
	}
}
