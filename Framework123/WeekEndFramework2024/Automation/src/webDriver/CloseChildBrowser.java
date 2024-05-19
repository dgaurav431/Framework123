package webDriver;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseChildBrowser {

	public static void main(String[] args) {
		
		String titleOfWindowToClose = "Facebook";
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://www.facebook.com/");
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://www.instagram.com/");
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://www.flipkart.com/");
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://www.amazon.in/");
		
		Set<String> allIDs = driver.getWindowHandles();
		
		for(String id:allIDs) {
			driver.switchTo().window(id);
			String currentPageTitle = driver.getTitle();
			
			if(currentPageTitle.contains(titleOfWindowToClose)) {
				driver.close();
				break;
			}
		}
	}

}
