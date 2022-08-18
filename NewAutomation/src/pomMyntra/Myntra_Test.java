package pomMyntra;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Myntra_Test {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Software testing\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		Myntra_HomePage MHP = new Myntra_HomePage(driver);
		MHP.clickshirtenter();
		Thread.sleep(2000);
		//Alert alt = driver.switchTo().alert();
		//alt.dismiss();
		//Thread.sleep(2000);
		Myntra_ShirtPage MSP = new Myntra_ShirtPage(driver);
		MSP.shirt();
		//MSP.shirt();
		Thread.sleep(2000);
		Myntra_Add a = new Myntra_Add(driver);
		a.add();
	}
}
