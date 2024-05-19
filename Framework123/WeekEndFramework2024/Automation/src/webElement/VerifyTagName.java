package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTagName {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/button?sublist=0");
		Thread.sleep(2000);
		
		WebElement yesButton = driver.findElement(By.id("btn"));
		
		String yesButtonTagName = yesButton.getTagName();
		
		System.out.println(yesButtonTagName);
		
		if(yesButtonTagName.equals("button")) {
			yesButton.click();
		}
	}

}
