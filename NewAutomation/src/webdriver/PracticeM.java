package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeM {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Software testing\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.yahoo.com/account/create?.intl=in&.lang=en-IN&src=search&activity=header-signin&pspid=2114723002&.done=https%3A%2F%2Fin.search.yahoo.com%2F%3Ffr2%3Dinr&specId=yidregsimplified&done=https%3A%2F%2Fin.search.yahoo.com%2F%3Ffr2%3Dinr");
		
		WebElement xyz = driver.findElement(By.id("usernamereg-firstName"));
		xyz.sendKeys("It's YahOO");
		
		By pqr = By.name("usernamereg-userId");
		driver.findElement(pqr).sendKeys("lllllllllllllll");
				
	}
	
}
