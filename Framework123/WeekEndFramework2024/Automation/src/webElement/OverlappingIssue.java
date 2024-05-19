package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OverlappingIssue {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/button?sublist=0");
		Thread.sleep(2000);
		
		WebElement yesButton = driver.findElement(By.id("btn"));
		WebElement noButton = driver.findElement(By.id("btn1"));
		
		Rectangle yesRect = yesButton.getRect();
		Rectangle noRect = noButton.getRect();
		
		int yesButtonStartX = yesRect.getX();
		int yesButtonWidth = yesRect.getWidth();
		
		int yesButtonEndX = yesButtonStartX + yesButtonWidth;
		
		int noButtonStartX = noRect.getX();
		
		if(noButtonStartX>=yesButtonEndX) {
			System.out.println("Pass: the Overlapping is verified");
		}
		
		else
			System.out.println("Fail: the Overlapping is not verified");

	
		driver.quit();
	}

}
