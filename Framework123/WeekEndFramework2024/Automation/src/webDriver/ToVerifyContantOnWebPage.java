package webDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyContantOnWebPage {

	public static void main(String[] args) {
		String expectedContent = "India";

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		
		String actualSourceCode = driver.getPageSource();
		
		if(actualSourceCode.contains(expectedContent)) {
			System.out.println("Pass: the content is verified");
		}
		
		else
			System.out.println("Fail: the content is not verified");

		
	}

}
