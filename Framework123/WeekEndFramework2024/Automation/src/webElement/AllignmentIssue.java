package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllignmentIssue {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/?scenario=1");
		
		Thread.sleep(2000);
		WebElement name = driver.findElement(By.id("name"));
		WebElement email = driver.findElement(By.id("email"));
		WebElement password = driver.findElement(By.id("password"));
		
		Point nameLoc = name.getLocation();
		Point emailLoc = email.getLocation();
		Point passwordLoc = password.getLocation();
		
		int nameStartX = nameLoc.getX();
		int emailStartX = emailLoc.getX();
		int passwordStartX = passwordLoc.getX();
		
		if(nameStartX==emailStartX && emailStartX == passwordStartX) {
			System.out.println("Pass: the allignment is verified");
		}
		
		else
			System.out.println("Fail: the allignment is not verified");


		driver.quit();
	}

}
