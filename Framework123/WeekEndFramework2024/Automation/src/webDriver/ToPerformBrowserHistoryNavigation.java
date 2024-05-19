package webDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToPerformBrowserHistoryNavigation {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		
		Thread.sleep(2000);
		Navigation nav = driver.navigate();
		
		nav.to("https://www.facebook.com/");
		Thread.sleep(2000);

		nav.to("https://www.instagram.com/");
		
		nav.back();
		Thread.sleep(2000);

		nav.forward();
		Thread.sleep(2000);

		nav.refresh();

	}

}
