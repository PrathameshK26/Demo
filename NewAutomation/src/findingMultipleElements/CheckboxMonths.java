package findingMultipleElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxMonths {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Software testing\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.navigate().to("file:///F:/Software%20testing/HTML/monthcheckbox.html");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@type='checkbox'][1]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@type='checkbox'][2]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@type='checkbox'][3]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@type='checkbox'][4]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@type='checkbox'][5]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@type='checkbox'][6]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@type='checkbox'][7]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@type='checkbox'][8]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@type='checkbox'][9]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@type='checkbox'][10]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@type='checkbox'][11]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@type='checkbox'][12]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
	
	Thread.sleep(4000);
	
	driver.findElement(By.xpath("//input[@type='checkbox'][12]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@type='checkbox'][11]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@type='checkbox'][10]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@type='checkbox'][9]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@type='checkbox'][8]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@type='checkbox'][7]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@type='checkbox'][6]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@type='checkbox'][5]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@type='checkbox'][4]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@type='checkbox'][3]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@type='checkbox'][2]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@type='checkbox'][1]")).click();
	Thread.sleep(4000);
	driver.quit();
	
	}
}
