package webdriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice2 {
	public static void main(String[] args) throws InterruptedException {
		String ds = "https://www.youtube.com/watch?v=F8OddhVyHeE&list=PL6flErFppaj2ArNxLyR4nQ4JV8qFc56-M&index=16";
		System.setProperty("webdriver.chrome.driver", "F:\\Software testing\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.youtube.com/watch?v=Y5aeKkGKQ0s&list=WL&index=2&t=1s");
		Thread.sleep(2000);
		driver.get("https://www.youtube.com/watch?v=F8OddhVyHeE&list=PL6flErFppaj2ArNxLyR4nQ4JV8qFc56-M&index=15");
		Thread.sleep(2000);
		driver.manage().window().fullscreen();
		Thread.sleep(2000);
		String sd = driver.getCurrentUrl();
		System.out.println(sd);
		if(ds.equals(sd)) {
			System.out.println("It's Same");
		}else {
			System.out.println("It's not Same");
		}
		driver.navigate().back();
		Thread.sleep(2000);
		Dimension h = new Dimension(300,800);
		driver.manage().window().setSize(h);
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.quit();
	}
}
