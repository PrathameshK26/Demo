package listBox;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintOptionsinListAlphabeticalorder {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Software testing\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(2000);
		WebElement months = driver.findElement(By.xpath("//select[@title='Month']"));
		Select s = new Select(months);
		List<WebElement> options = s.getOptions();
		TreeSet<String> ts = new TreeSet<String>();
		for(WebElement opt:options) {
			String text = opt.getText();
			ts.add(text);
			}
		for(String s1:ts) {
			System.out.println(s1);
		}
		Thread.sleep(2000);
		driver.quit();
	}
}
