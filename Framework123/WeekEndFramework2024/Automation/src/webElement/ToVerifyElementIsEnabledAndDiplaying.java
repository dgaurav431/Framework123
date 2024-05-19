package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//WAS to verify whether any element is enabled and Displaying or not
public class ToVerifyElementIsEnabledAndDiplaying {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://github.com/signup?ref_cta=Sign+up&ref_loc=header+logged+out&ref_page=%2F&source=header-home");
		
		Thread.sleep(5000);
		
		WebElement email = driver.findElement(By.id("email"));
		
		WebElement continueButton = driver.findElement(By.xpath("//button[@data-continue-to=\"password-container\"]"));
		
		boolean emailDisplayed = email.isDisplayed();
		
		if(emailDisplayed) {
			
			email.sendKeys("akashdeb3rw45@gmail.com");
			
			Thread.sleep(2000);
			
			boolean continueButtonEnabled = continueButton.isEnabled();
			
			if(continueButtonEnabled) {
				
				System.out.println("Pass: the button is enabled");
			}
			
			else
				System.out.println("Fail: the button is not enabled");

			
			System.out.println("Pass: the email is displaying");
		}
		
		else
			System.out.println("Fail: the email is not displaying");

	}

}
