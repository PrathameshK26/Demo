package webElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox2getSizeofList {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Software testing\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[@rel='async']")).click();
		Thread.sleep(2000);
		
		WebElement year = driver.findElement(By.xpath("//(select[@title='Year'])"));
		Select s = new Select(year);
		List<WebElement> options = s.getOptions();
				int size = options.size();
		System.out.println("size of year ListBox:"+ size);
		Thread.sleep(2000);
		
		System.out.println("Print all options in listbox using for loop");
		for(int i=0;i<=size-1;i++) {
			System.out.println(options.get(i).getText());
			Thread.sleep(2000);
		System.out.println("Print all options in listbox using foreach loop");
		for(WebElement option:options) {
			System.out.println(option.getText());
			Thread.sleep(2000);
			//driver.quit();
		}
		}//Exception
		
	}
	}

