package customizedListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_DragNDrop {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Software testing\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		WebElement src = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
		WebElement dest = driver.findElement(By.xpath("(//h3[@align='center'])[3]/ui"));
		Actions act = new Actions(driver);
		//4. dragAndDrop
		act.dragAndDrop(src, dest).perform();
		
	}
}
