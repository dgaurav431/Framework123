package webElement;

import javax.print.attribute.standard.MediaSize.NA;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyDimension {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/?scenario=1");
		
		Thread.sleep(2000);
		WebElement name = driver.findElement(By.id("name"));
		WebElement email = driver.findElement(By.id("email"));
		WebElement password = driver.findElement(By.id("password"));
		
		Dimension nameDim = name.getSize();
		Dimension emailDim = email.getSize();
		Dimension passwordDim = password.getSize();
		
		int nameWidth = nameDim.getWidth();
		int nameHeight = nameDim.getHeight();
		
		int emailWidth = emailDim.getWidth();
		int emailHeight = emailDim.getHeight();
		
		int passwordWidth = passwordDim.getWidth();
		int passwordHeight = passwordDim.getHeight();
		
		if(nameWidth == emailWidth && emailWidth == passwordWidth && nameHeight == emailHeight && emailHeight==passwordHeight) {
			System.out.println("Pass:the dimensions are verified");
		}
		
		else
			System.out.println("Fail:the dimensions are not verified");


		driver.quit();

		
	}

}
