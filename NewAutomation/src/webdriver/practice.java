package webdriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice {
	public static void main(String[] args) throws InterruptedException {
		String tyl = "Home - QAFox";
		String durl = "https://web.whatsapp.com/";
		System.setProperty("webdriver.chrome.driver", "F:\\Software testing\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.navigate().to("https://www.qafox.com/");
		Thread.sleep(2000);
		String asd = driver.getTitle();
		System.out.println(asd);
		if(tyl.equals(asd)) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}
		driver.manage().window().maximize();
		Thread.sleep(2000);
		Dimension f = new Dimension(200,600);
		driver.manage().window().setSize(f);
		Thread.sleep(2000);
		driver.get("https://web.whatsapp.com/");
		String surl = driver.getCurrentUrl();
		System.out.println(surl);
		if(durl.equals(surl)) {
			System.out.println("Equal");
			
		}else {
			System.out.println("Not Equal");
		}
		Thread.sleep(2000);
		String ttl = driver.getTitle();
		System.out.println(ttl);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.quit();
	}
}
