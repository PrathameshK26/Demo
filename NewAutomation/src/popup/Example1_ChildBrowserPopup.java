package popup;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1_ChildBrowserPopup {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Software testing\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skpatro.github.io/demo/links/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='button'])[3]")).click();
		String idofmainpage = driver.getWindowHandle();
		System.out.println(idofmainpage);//CDwindow-0D0640849513F403A6F86BA2BC7330C7
		Set<String> ids = driver.getWindowHandles();
		ArrayList<String> al = new ArrayList<String>(ids);
		System.out.println(al.get(0));//CDwindow-CFA2444DBDC2F31674604916B9B00D1D
		System.out.println(al.get(1));//CDwindow-B392E4280264DBDAC151FD499730F007
		Thread.sleep(2000);
		driver.quit();
		
	}
}
