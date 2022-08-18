package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Software testing\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@data-index='3']")).click();
		driver.findElement(By.xpath("//img[@class='card-image ']")).click();
		driver.findElement(By.xpath("//img[@class='img-responsive preLoad loaded']")).click();
	}
}
