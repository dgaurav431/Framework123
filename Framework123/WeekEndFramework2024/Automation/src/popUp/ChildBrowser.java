package popUp;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowser {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/browser/multipleWindow?sublist=2");
		
		driver.findElement(By.id("browserButton3")).click();
		
		Set<String> allIds = driver.getWindowHandles();
		
		for(String id:allIds) {
			driver.switchTo().window(id);
			String currentURL = driver.getCurrentUrl();
			
			if(currentURL.equals("https://demoapps.qspiders.com/ui/browser/SignUp")) {
				driver.close();
				break;
			}
		}
		
	}

}
