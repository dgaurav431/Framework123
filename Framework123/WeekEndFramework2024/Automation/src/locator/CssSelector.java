package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/?scenario=1");
		
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[placeholder='Enter your name']")).sendKeys("Akash");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
	}

}
