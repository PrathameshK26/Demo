package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gettitle {
	public static void main(String [] args) {
		
		String ExpTitle = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
		
		System.setProperty("webdriver.chrome.driver", "F:\\Software testing\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		//4. get title
		String ActTitle = driver.getTitle();
		System.out.println(ActTitle);//Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!
		
		if(ExpTitle.equals(ActTitle)) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}
		driver.quit();
	}

}
