package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToClear {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/User/Desktop/demoApp.html");
	
		 WebElement username = driver.findElement(By.xpath("(//input)[1]"));
		WebElement password = driver.findElement(By.xpath("(//input)[2]"));
		username.clear();
		Thread.sleep(2000);
		username.sendKeys("akash");
		
		password.clear();
		Thread.sleep(2000);
		password.sendKeys("akaksh23435");
		
	}

}
