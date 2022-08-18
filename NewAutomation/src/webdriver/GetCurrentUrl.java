package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrl {
	public static void main(String [] args) throws InterruptedException {
		
		String ExpUrl = "https://www.flipkart.com/";
		
		System.setProperty("webdriver.chrome.driver", "F:\\Software testing\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
			Thread.sleep(2000);
		//5. Maximize()
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//6. GetCurrentURL()
		String ActURL = driver.getCurrentUrl();
		System.out.println(ActURL);
		
		if(ActURL.equals(ExpUrl)) {
			System.out.println("Pass");
			
		}else {System.out.println("Fail");
	}
		Thread.sleep(2000);
		//7. minimize
	driver.manage().window().minimize();
	Thread.sleep(2000);
	driver.quit();
	
}
}
