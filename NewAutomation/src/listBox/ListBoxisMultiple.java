package listBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxisMultiple {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Software testing\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(2000);
		WebElement months = driver.findElement(By.xpath("//select[@id='month']"));
		Select s = new Select(months);
		boolean result = s.isMultiple();
		if(result==true) {
			System.out.println("List box is multiselectable");
			}else {
			System.out.println("List box is single selectable");
		}
		Thread.sleep(2000);
		driver.quit();
	}
}
