package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RefisterAnUser {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/?scenario=1");
		
		Thread.sleep(2000);
		//id Locator
		WebElement name = driver.findElement(By.id("name"));
		//name Locator
		WebElement email = driver.findElement(By.name("email"));
		WebElement password = driver.findElement(By.id("password"));
		//tagname Locator
		WebElement register = driver.findElement(By.tagName("button"));
		
		name.sendKeys("Chitrbhan");
		email.sendKeys("chitraban@gmail.com");
		password.sendKeys("priya@143");
		register.click();


	}

}
