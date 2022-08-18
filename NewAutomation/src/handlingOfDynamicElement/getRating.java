package handlingOfDynamicElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getRating {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Software testing\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	driver.manage().window().maximize();
		
	driver.get("https://www.flipkart.com/");
	Thread.sleep(2000);	
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("laptop");
	Thread.sleep(2000);	
	driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	Thread.sleep(2000);
	String reviews = driver.findElement(By.xpath("//div[@class='_3pLy-c row'][1]//span[2]")).getText();
	System.out.println(reviews);//1,945 Ratings & 224 Reviews
	
	Thread.sleep(2000);
	
	driver.quit();

}
}
