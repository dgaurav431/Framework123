package webDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTheTitle {

	public static void main(String[] args) {
		String expectedTitle = "Facebook";
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		String actualTitle = driver.getTitle();
				
		if(actualTitle.contains(expectedTitle)) {
			System.out.println("Pass: the title has been verified");
		}
		
		else
			System.out.println("Fail: the title has not been verified");

		
		
	}

}
