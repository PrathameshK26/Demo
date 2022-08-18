package listBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxGetSizeOfList {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Software testing\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(2000);
		WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select s = new Select(month);
		List<WebElement> options = s.getOptions();
		int size = options.size();
		System.out.println("Size of ListBox:"+size);
		Thread.sleep(2000);
		System.out.println("Print by foreach loop");
		for(WebElement option:options) {
			System.out.println(option.getText());
		}
		System.out.println("Print by for loop");
		for(int i=0;i<=size-1;i++) {
			System.out.println(options.get(i).getText());
		}
		driver.quit();
		
	}
}
