package webDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyContentInTheURL {

	public static void main(String[] args) {
		String expectedURLContent = "iphone";

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/search?q=iphone&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off");
		
		String actualURL = driver.getCurrentUrl();
		
		if(actualURL.contains(expectedURLContent)) {
			System.out.println("Pass: the URL content is verified");
		}
		
		else
			System.out.println("Fail: the URL content is not verified");

	}

}
