package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllWebElements {

	public static void main (String [] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Software testing\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://twitter.com/");
		
		boolean result;
		try {
		WebElement resul = driver.findElement(By.xpath("//span[text()='Join the conversation on Twitter']"));
		result = resul.isDisplayed();
		
		}
		catch(Exception e){
			result = false;
		}
		System.out.println(result);
		Thread.sleep(2000);
		driver.quit();
		
}
}
